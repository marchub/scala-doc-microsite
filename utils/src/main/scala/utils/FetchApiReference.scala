package utils

import org.jsoup.Jsoup

import scala.collection.JavaConverters._
import better.files._
import java.io.{File => JFile}

import utils.config.{ApiClass, ConfigLoader}



object Main extends App {

  val apiClasses = ConfigLoader.load()
  val fetcher = new FetchApiReference()

  apiClasses.foreach { fetcher.fetch }
  fetcher.createClassesIndex(apiClasses)
}

case class Element(name: String, filename: String, link: String, html: String)

class FetchApiReference {

  // TODO: support multiple classes (List, Map etc etc)

//  val className = "List"
//  val classPath = "scala/collection/immutable"
//  val url = "https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html"

  val docsDestinationRootPath = "site/src/main/tut/apis"

  val outputHtmlRootPath = "classes_html"
  val outputRootPath = "worksheets"
  val COMMENT = "//"
  val WORKSHEET_START = "//-- START WORKSHEET ---"

  def fetch(apiClass: ApiClass) = {

    println(s"Loading ApiClass ${apiClass.toString}")

    val docsPath = s"$docsDestinationRootPath/${apiClass.path}" //TODO add /${apiClass.name} to path!!!!!!!!!!!!!!!!!!!!!!
    val path = s"$outputRootPath/${apiClass.path}" //TODO add /${apiClass.name} to path!!!!!!!!!!!!!!!!!!!!!!

    File(outputHtmlRootPath).createDirectoryIfNotExists()
    val cachedHtmlPage = File(s"${outputHtmlRootPath}/${apiClass.name}.html")
    val doc = if (cachedHtmlPage.exists) {
      println(s"loading from cached file ${cachedHtmlPage.pathAsString}")
      Jsoup.parse(cachedHtmlPage.toJava, null, apiClass.url)
    } else {
      println(s"downloading file from ${apiClass.url}")
      val connection = Jsoup.connect(apiClass.url)
      //val d = connection.get
      val response = connection.execute()
      cachedHtmlPage.overwrite(response.body())
      response.parse()
    }

    println(s"TITLE of url: " + doc.title())

    File(path).createDirectoryIfNotExists()
    File(docsPath).createDirectoryIfNotExists()

    val elements = doc.select("#allMembers li").asScala.collect{ case el if el.attr("name").nonEmpty =>
      val name = el.attr("name")
     // println(s"name is $name")
      val filteredName = name.replaceAll("[^a-zA-Z0-9-_\\.]", "_") //.replaceAll("\\W+", "_")
      val filename = s"$path/${filteredName}_${name.hashCode}.sc"
      //val filename = s"${name}_${FetchApiReference.md5(name)}.sc"
      val link = el.select("span.permalink a").asScala.head.absUrl("href")
      val html = el.outerHtml()
//      println(s"$name  ->  $filename  url:$link  HTML:\n$html")
      println(s"$name  ->  $filename  url:$link")
      Element(name, filename, link, html)
    }.groupBy(_.name)

    println(s"Creating ${elements.size} files")

//    elements.take(5).foreach{ case (name, els) =>
    elements.foreach{ case (name, els) =>
      val workSheetFilename = els.head.filename
      val workSheetFile = File(workSheetFilename)
      val header = els.map{ el =>
        s"""
          |<li><a href="${el.link}">${el.name}</a></li>
          |${el.html}
        """.stripMargin
      }.mkString("\n<ol>","\n","</ol>")
      val commentedHeader = commentOut(header).mkString("\n")

      val finalHeader = commentedHeader + s"\n\n\n$WORKSHEET_START\n"

      val docPath = workSheetFile.pathAsString.replace(s"$outputRootPath${JFile.separator}", s"$docsDestinationRootPath${JFile.separator}")
                                              .replace(".sc",".md") //TODO replace from the end of string: https://stackoverflow.com/questions/37945653/scala-remove-the-last-occurrence-of-a-character
      val docFile = File(docPath)

      println(s"Creating ${workSheetFile.pathAsString} and  ${docFile.pathAsString} files")

      if (workSheetFile.exists) {
        val userContentUnfiltered = workSheetFile.lines.dropWhile(_.trim != WORKSHEET_START).drop(1).toList
        val userContent = if (userContentUnfiltered.forall(_.trim.replaceAll("[\\r\\n]", "").isEmpty)) List() else userContentUnfiltered
        println(s"Keeping ${userContent.size} lines of user content")

        if (workSheetFile.pathAsString.contains("sorted"))
            1 + 1

        workSheetFile.overwrite(finalHeader).appendLines(userContent: _*)

        docFile.clear().appendLines((unCommentBlock(finalHeader) :: userContent.map(unCommentLine)) : _*)
      } else {
        workSheetFile.overwrite(finalHeader)
        docFile.clear().appendLines(unCommentBlock(finalHeader))
      }




      //file.copyTo(docFile, overwrite = true)


      //C:\Users\Marc\Documents\programming\dummy-sbt-microsite\site\src\main\tut\apis
    }

    //TODO: create main index
    val classIndexFile = File(s"$outputRootPath/${apiClass.name}.md") //TODO remove
    val destClassIndexFile = File(classIndexFile.pathAsString.replace(s"$outputRootPath${JFile.separator}", s"$docsDestinationRootPath${JFile.separator}"))
    println(s"Creating index ${classIndexFile.pathAsString} and ${destClassIndexFile.pathAsString}")

    val FunctionNameRegex = ".*#([^\\[:(]+).*".r
    val FallbackFunctionNameRegex = ".*#(.*)".r

    //classIndexFile.clear()
    //classIndexFile.appendLine(s"## $className\n\n")

    destClassIndexFile.clear()
    destClassIndexFile.appendLine(s"## ${apiClass.name}\n\n")

//    elements.take(5).foreach{ case (name, els) =>
    elements.foreach{ case (name, els) =>
      val el = els.head
      val fct = el.link match {
        case FunctionNameRegex(fctName) => fctName
        case FallbackFunctionNameRegex(fctName) => fctName
        case _ => throw new Exception(s"cannot parse function name from $el") //TODO do another fallback using say a hashcode
      }
//      val relativePathToFile = el.filename.replace(s"$outputRootPath/", "")
      val relativePathToFile = el.filename.replace(s"$outputRootPath/", "")
                                           .replace(".sc",".md") //TODO replace from the end of string: https://stackoverflow.com/questions/37945653/scala-remove-the-last-occurrence-of-a-character
      //TODO: just before , add:
      // <a name="getting-started"></a>
      destClassIndexFile.appendLine(s"* [$fct]($relativePathToFile)\n")
    }

    //println(s"Creating index ${destClassIndexFile.pathAsString}")
    //classIndexFile.copyTo(destClassIndexFile, overwrite = true)
    //[sbt-microsites](https://github.com/47deg/sbt-microsites).
  }

  def commentOut(s: String) = s.split("\n").map(COMMENT + _)

  def unCommentBlock(s: String) = s.replace(WORKSHEET_START, "### Examples\n\n")
                                         .replace(s"\n$COMMENT","\n")
  def unCommentLine(s: String) = if (s.startsWith("//")) s.replaceFirst("\\/\\/","") else s


  def createClassesIndex(apiClasses: List[ApiClass]) : Unit = {

    val classesIndexFile = File(s"$docsDestinationRootPath/index.md")

    classesIndexFile.clear()
    classesIndexFile.appendLine(s"# Classes\n\n")

    apiClasses.foreach{ apiClass =>
      classesIndexFile.appendLine(s"* [${apiClass.name}](${apiClass.name}.md)\n")
    }


  }
}

object FetchApiReference {
//  import java.security.MessageDigest
//
//  def md5(s: String) = {
//    MessageDigest.getInstance("MD5").digest(s.getBytes)
//  }
}