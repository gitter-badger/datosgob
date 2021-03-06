import sbt._

object Dependencies {
  // Versions
  lazy val akkaVersion = "2.4.0-RC1"

  // Libraries
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http-experimental" % "1.0"
  val akkaHttpJson = "de.heikoseeberger" %% "akka-http-play-json" % "1.0.0"
  val slick = "com.typesafe.slick" %% "slick" % "3.0.2"
  val sqlite = "org.xerial" % "sqlite-jdbc" % "3.8.11.1"
  val hikaricp = "com.zaxxer" % "HikariCP" % "2.3.9"
  val postgres = "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
  val selenium = "org.seleniumhq.selenium" % "selenium-java" % "2.47.1"
  val phantomjsdriver = "com.codeborne" % "phantomjsdriver" % "1.2.1"
  val logback = "ch.qos.logback" % "logback-classic" % "1.1.3"

  // Projects
  val datosDeps =
    Seq(slick, sqlite, hikaricp, postgres, logback)

  val webDeps =
    Seq(akkaActor, akkaHttp, akkaHttpJson)

  val recolectorDeps =
    Seq(selenium, phantomjsdriver, logback)
}
