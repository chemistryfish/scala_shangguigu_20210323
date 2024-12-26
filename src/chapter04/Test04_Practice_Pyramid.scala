package chapter04

object Test04_Practice_Pyramid {
  def main(args: Array[String]): Unit = {
    for {
      i <- 1 to 9
      stars = 2 * i - 1
      spaces = 9 - i
    } {
      println(" " * spaces + "*" * stars)
    }
    println("=======================")

    val a: Unit = for (i <- 1 to 5) {
      print(i + " ")
    }
    println("a = " + a) // 1 2 3 4 5 a = ()
    println("=======================")

    val b: Unit = for (i <- 1 to 5) {
      i
    }
    println("b = " + b) // b = ()
    println("=======================")

    val c = for (i <- 1 to 5) yield i * i
    println("c = " + c) // c = Vector(1, 4, 9, 16, 25)
    println("=======================")
  }
}
