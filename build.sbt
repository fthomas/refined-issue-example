import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaOrganization := "org.typelevel",
      scalaVersion := "2.12.4-bin-typelevel-4",
      version      := "0.1.0-SNAPSHOT",
      scalacOptions += "-Yliteral-types"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "eu.timepit" %% "refined" % "0.8.2"
  )
