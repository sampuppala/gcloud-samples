package com.word.test

object Word {
  def main(args: Array[String]): Unit = {
    println("Id, EmployeeName, JobTitle, BasePay")
    val bufferedSource = io.Source.fromFile("gs://sample-buckt-me/Salaries.csv")
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      // do whatever you want with the columns here
      println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    }
    bufferedSource.close
  }
}
