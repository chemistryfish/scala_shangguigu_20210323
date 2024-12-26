package chapter05

import scala.annotation.unused

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(fun(0, "", '0')) // false

    def func(i: Int): String => Char => Boolean = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0')) // false

    def func2(i: Int): String => (Char => Boolean) = { s => c =>
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(func2(0)("")('0')) // false

    def func3(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(func3(0)("")('0')) // false

  }
}
