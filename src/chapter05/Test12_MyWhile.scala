package chapter05

object Test12_MyWhile {
  def main(args: Array[String]): Unit = {
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
      doLoop
    }

    var n = 5
    myWhile(n >= 1) {
      println(n) // 5, 4, 3, 2, 1
      n -= 1
    }
    println("====================")

    def myWhile2(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile2(condition)(op)
      }
    }

    n = 5
    myWhile2(n >= 1) {
      println(n) // 5, 4, 3, 2, 1
      n -= 1
    }
    println("====================")
  }
}
