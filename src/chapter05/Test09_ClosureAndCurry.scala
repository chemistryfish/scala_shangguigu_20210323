package chapter05

object Test09_ClosureAndCurry {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    def addByFour(b: Int): Int = {
      return 4 + b
    }

    def addByFive(b: Int): Int = {
      return 5 + b
    }

    def addBy(a: Int): Int => Int = {
      // return b => a + b
      return a + _
    }
    println(addBy(5)(1)) // 6

    def addCurry(a: Int)(b: Int): Int = {
      return a + b
    }
    println(addCurry(5)(1)) // 6
  }
}
