package utils.config

import pureconfig.generic.auto._

case class ApiClass(name: String,
                    path: String,
                    url: String
                   )

object ConfigLoader {

    def load(): List[ApiClass] = {
      pureconfig.loadConfig[List[ApiClass]](namespace = "classes") match {
        case Right(classes) => classes
        case Left(error) =>
          println("Error loading config: " + error)
          sys.exit(1)
      }

    }
}
