ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "spark",
    idePackagePrefix := Some("com.mikestaszel.spark")
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.0"
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "3.3.4"
