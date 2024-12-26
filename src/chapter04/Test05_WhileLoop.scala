package chapter04

object Test05_WhileLoop {
  def main(args: Array[String]): Unit = {
    var a: Int = 5
    while (a >= 1) {
      println(a) // 5, 4, 3, 2, 1
      a -= 1
    }
    println("================")

    var b: Int = 0
    do {
      println(b) // 0
    } while (b > 0)
  }
}
