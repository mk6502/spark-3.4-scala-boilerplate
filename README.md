# Spark 3.4 + Scala 2.12 Boilerplate
This is a sample project to get everything up and running.

# Versions Used
* JDK 11 or 17 are both supported.
* `sbt` 1.8.3.
* Scala 2.12.
* Spark 3.4.0.

# Building
Using `sbt` 1.8.3:

    sbt package

# Running
Run with:

    sbt package && spark-submit --master "local[*]" --class com.mikestaszel.spark.jobs.CountLines target/scala-2.12/spark_2.12-0.1.0-SNAPSHOT.jar
