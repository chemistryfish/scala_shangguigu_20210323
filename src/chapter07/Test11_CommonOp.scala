package chapter07

object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4)
    val s = Set(1, 2, 3, 4)
    println(l.length) // 4
    println(s.size) // 4

    for (x <- l) println(x) // 1, 2, 3, 4
    s.foreach(println) // 1, 2, 3, 4
    for (x <- l.iterator) println(x) // 1, 2, 3, 4

    println(s.mkString("--")) // 1--2--3--4
    println(l.contains(5)) // false
    println(s.contains(3)) // true
  }
}
