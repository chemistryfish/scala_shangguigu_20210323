package chapter04

import scala.util.control.Breaks.{break, breakable}

object Test06_Break {
  def main(args: Array[String]): Unit = {
    breakable(
      for (i <- 0 until 5) {
        if (i == 3) break()
        println(i) // 0, 1, 2
      }
    )
  }
}
