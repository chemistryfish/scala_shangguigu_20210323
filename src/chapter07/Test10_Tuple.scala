package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    val t : (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(t) // (hello,100,a,true)

    println(t._1) // hello
    println(t._2) // 100

    for (x <- t.productIterator) println(x)

    val mulTuple = (12, 0.3, "hello", (1, 2, 3))
    println(mulTuple._4._2) // 2
  }
}
