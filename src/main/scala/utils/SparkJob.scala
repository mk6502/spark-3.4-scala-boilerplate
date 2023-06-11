package com.mikestaszel.spark
package utils

import org.apache.spark.sql.SparkSession

/** Base class for Spark jobs.
 */
class SparkJob {
  val spark: SparkSession = SparkSession.builder.appName("job").getOrCreate()
  spark.sparkContext.setLogLevel("WARN")

  /** Execute method - the body of the Spark logic to execute.
   */
  def execute(args: Array[String]): Unit = {
    // override it
  }

  /** Main method. Entrypoint into the application.
   */
  def main(args: Array[String]): Unit = {
    execute(args)
  }
}
