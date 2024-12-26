package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f is called")
      n + 1
    }
    val result: Int = f(123)
    println(result) // f is called, 124

    val f1: Int => Int = f
    println(f1) // output the function address
    println(f1(123)) // f is called, 124

    def fun(): Int = 123
    val f2 = fun
    println(f2) // 123
    val f3 = fun _
    println(f3) // output the function address
    val f4: () => Int = fun
    println(f4) // output the function address

    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }
    println(dualEval(_ + _, 1, 2)) // 3
    println(dualEval(_ - _, 1, 2)) // -1

    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6 is called on " + a)
      }
      f6
    }
    f5()(3) // f6 is called on 3
  }
}
