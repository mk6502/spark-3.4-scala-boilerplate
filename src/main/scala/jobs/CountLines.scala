package com.mikestaszel.spark
package jobs

import utils.SparkJob

/** A sample Spark job.
 *
 */
object CountLines extends SparkJob {
  /** Count rows in a folder full of Parquet files.
   */
  override def execute(args: Array[String]): Unit = {
    val ookla = spark.read.parquet("s3a://ookla-open-data/parquet/performance/type=mobile/year=2022/quarter=4/")
    val count = ookla.count()

    println(s"Line count: $count")

    spark.stop()
  }
}
