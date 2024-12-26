package chapter08

object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    val (x, y) = (10, "hello")
    println(x + " " + y) // 10 hello

    val List(first, second, _*) = List(1, 2, 3, 4, 5)
    println(first + " + " + second) // 1 + 2

    val List(first2, second2) = List(1, 2)
    println(first2 + " + " + second2) // 1 + 2

    // val List(first3, second3) = List(1) // error

    val fir :: sec :: rest = List(1, 2, 3, 4, 5)
    println(fir + " + " + sec + " + " + rest) // 1 + 2 + List(3, 4, 5)

    val l = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))
    // a => 12
    // b => 35
    // c => 27
    // a => 13
    for ((word, count) <- l) {
      println(s"$word => $count")
    }
    // a => 12
    // a => 13
    for (("a", count) <- l) {
      println(s"a => $count")
    }

  }
}
