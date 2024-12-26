package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    def f1(): Int = {
      3
    }
    // parameter: a function with no parameter and return Int
    def f2(a: => Int): Unit = {
      println("a: " + a)
    }
    f2(3) // a: 3
    f2(f1()) // a: 3
    f2(f1) // a: 3
  }
}
