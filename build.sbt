// https://47deg.github.io/sbt-microsites/docs/settings.html
// good small example: https://github.com/gvolpe/console4cats/blob/master/build.sbt


import microsites.ExtraMdFileConfig

name := "scala-doc-microsite"
version := "1.0"
scalaVersion := "2.12.8"
//crossScalaVersions := Seq("2.10.7", "2.11.12")



//com.typesafe.sbt.SbtGhPages.GhPagesKeys.ghpagesNoJekyll := false

//val sc = 

lazy val root = project
  .in(file("."))
  .aggregate(utils, microsite)
  //.settings(noPublish)

lazy val dependencies = Seq(
  "org.jsoup" % "jsoup" % "1.11.3",
  "com.github.pathikrit" %% "better-files" % "3.7.0",
  "com.github.pureconfig" %% "pureconfig" % "0.10.1",
  "org.scalacheck" % "scalacheck" % "1.4" withSources() //1.14.0
  //https://repo1.maven.org/maven2/org/scalacheck/scalacheck/1.4/scalacheck-1.4.pom
  //https://repo1.maven.org/maven2/org/scalacheck/scalacheck/1.14/scalacheck-1.14.pom 
)

lazy val utils = project
  .in(file("utils"))
  .settings(
    libraryDependencies ++= dependencies
  )
  //.settings(commonSettings: _*)
  //.enablePlugins(AutomateHeaderPlugin)

lazy val microsite = project
  .in(file("site"))
  .enablePlugins(MicrositesPlugin)
  //.settings(commonSettings: _*)
  //.settings(noPublish)
  .settings(
    autoAPIMappings := true, //???
    micrositeName := "Microsite Demo",
    micrositeDescription := "How to use the sbt-microsites plugin",
    micrositeHighlightTheme := "atom-one-light",
    micrositeDocumentationUrl := "/dummy-sbt-microsite/docs/",
    micrositeDataDirectory := (resourceDirectory in Compile).value / "microsite" / "data",
    micrositeBaseUrl := "dummy-sbt-microsite",
    micrositeGithubOwner := "47deg",
    micrositeGithubRepo := "dummy-sbt-microsite",
    
    micrositeExtraMdFiles := Map(
      file("CONSEQUAT.md") -> ExtraMdFileConfig(
        "consequat.md",
        "page",
        Map("title" -> "Consequat", "section" -> "consequat", "position" -> "0")
      )),
    micrositePalette := Map(
      "brand-primary"     -> "#FC4053",
      "brand-secondary"   -> "#B92239",
      "brand-tertiary"    -> "#8C192F",
      "gray-dark"         -> "#464646",
      "gray"              -> "#7E7E7E",
      "gray-light"        -> "#E8E8E8",
      "gray-lighter"      -> "#F6F6F6",
      "white-color"       -> "#FFFFFF")
//    micrositeName := "Console4Cats",
//    micrositeDescription := "Console I/O for Cats Effect",
//    micrositeAuthor := "Gabriel Volpe",
//    micrositeGithubOwner := "gvolpe",
//    micrositeGithubRepo := "console4cats",
//    micrositeBaseUrl := "/console4cats",
//    micrositeExtraMdFiles := Map(
//      file("README.md") -> ExtraMdFileConfig(
//        "index.md",
//        "home",
//        Map("title" -> "Home", "position" -> "0")
//      )
//    ),
//    micrositeGitterChannel := true,
//    micrositeGitterChannelUrl := "typelevel/cats-effect",
//    micrositePushSiteWith := GitHub4s,
//    micrositeGithubToken := sys.env.get("GITHUB_TOKEN"),
//    fork in tut := true,
//    scalacOptions in Tut --= Seq(
//      "-Xfatal-warnings",
//      "-Ywarn-unused-import",
//      "-Ywarn-numeric-widen",
//      "-Ywarn-dead-code",
//      "-Xlint:-missing-interpolator,_",
//    )
  )

// CI build
addCommandAlias("buildConsole4Cats", ";clean;+test;tut")

/*
scalacOptions ++= Seq(
    "-target:jvm-1.8",
    "-deprecation", // Emit warning and location for usages of deprecated APIs.
    "-encoding",
    "utf-8", // Specify character encoding used by source files.
    "-explaintypes", // Explain type errors in more detail.
    "-feature", // Emit warning and location for usages of features that should be imported explicitly.
    "-language:existentials", // Existential types (besides wildcard types) can be written and inferred
    "-language:experimental.macros", // Allow macro definition (besides implementation and application)
    "-language:higherKinds", // Allow higher-kinded types
    "-language:implicitConversions", // Allow definition of implicit functions called views
    "-unchecked",  // Enable additional warnings where generated code depends on assumptions.
    "-Xcheckinit", // Wrap field accessors to throw an exception on uninitialized access.
    //      "-Xfatal-warnings",                  // Fail the compilation if there are any warnings.
    "-Xfuture", // Turn on future language features.
    "-Xlint:adapted-args", // Warn if an argument list is modified to match the receiver.
    "-Xlint:by-name-right-associative", // By-name parameter of right associative operator.
    "-Xlint:constant", // Evaluation of a constant arithmetic expression results in an error.
    "-Xlint:delayedinit-select", // Selecting member of DelayedInit.
    "-Xlint:doc-detached", // A Scaladoc comment appears to be detached from its element.
    "-Xlint:inaccessible", // Warn about inaccessible types in method signatures.
    "-Xlint:infer-any", // Warn when a type argument is inferred to be `Any`.
    "-Xlint:missing-interpolator", // A string literal appears to be missing an interpolator id.
    "-Xlint:nullary-override", // Warn when non-nullary `def f()' overrides nullary `def f'.
    "-Xlint:nullary-unit", // Warn when nullary methods return Unit.
    "-Xlint:option-implicit", // Option.apply used implicit view.
    "-Xlint:package-object-classes", // Class or object defined in package object.
    "-Xlint:poly-implicit-overload", // Parameterized overloaded implicit methods are not visible as view bounds.
    "-Xlint:private-shadow", // A private field (or class parameter) shadows a superclass field.
    "-Xlint:stars-align", // Pattern sequence wildcard must align with sequence component.
    "-Xlint:type-parameter-shadow", // A local type parameter shadows a type already in scope.
    "-Xlint:unsound-match", // Pattern match may not be typesafe.
    "-Yno-adapted-args", // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
    "-Ypartial-unification", // Enable partial unification in type constructor inference
    "-Ywarn-dead-code", // Warn when dead code is identified.
    "-Ywarn-extra-implicit", // Warn when more than one implicit parameter section is defined.
    "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
    "-Ywarn-infer-any", // Warn when a type argument is inferred to be `Any`.
    "-Ywarn-nullary-override", // Warn when non-nullary `def f()' overrides nullary `def f'.
    "-Ywarn-nullary-unit", // Warn when nullary methods return Unit.
    "-Ywarn-numeric-widen", // Warn when numerics are widened.
    "-Ywarn-unused:implicits", // Warn if an implicit parameter is unused.
    "-Ywarn-unused:imports", // Warn if an import selector is not referenced.
    "-Ywarn-unused:locals", // Warn if a local definition is unused.
    "-Ywarn-unused:params", // Warn if a value parameter is unused.
    "-Ywarn-unused:patvars", // Warn if a variable bound in a pattern is unused.
    "-Ywarn-unused:privates", // Warn if a private member is unused.
    "-Ywarn-value-discard" // Warn when non-Unit expression results are unused.
  )
 */