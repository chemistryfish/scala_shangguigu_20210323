package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    def dualFunction(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }
    val add = (a: Int, b: Int) => a + b
    println(dualFunction(add)) // 3
    println(dualFunction((a, b) => a + b)) // 3
    println(dualFunction(_ + _)) // 3
    println(dualFunction(-_ + _)) // 1
  }
}
