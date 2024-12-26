package chapter05

import scala.annotation.tailrec

object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5)) // 120
    println(tailFact(5)) // 120
  }

  // may incur stack overflow
  // @tailrec // error
  def fact(n: Int): Int = {
    if (n == 0) 1 else n * fact(n - 1)
  }

  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, cur: Int): Int = {
      if (n == 0) cur else loop(n - 1, cur * n)
    }
    loop(n, 1)
  }
}
