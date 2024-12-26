package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val l = List(5, 1, 8, 2, -3, 4)
    println(l.sum) // 17
    println(l.product) // -960
    println(l.max) // 8
    println(l.min) // -3

    val l2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2))
    println(l2.maxBy(_._2)) // (c,8)
    println(l2.sorted) // List((a,5), (b,1), (c,8), (d,2))
    println(l2.sorted.reverse) // List((d,2), (c,8), (b,1), (a,5))
    println(
      l2.sorted(Ordering[(String, Int)].reverse)
    ) // List((d,2), (c,8), (b,1), (a,5))
    println(l2.sortBy(_._2)) // List((b,1), (d,2), (a,5), (c,8))
    println(
      l2.sortBy(_._2)(Ordering[Int].reverse)
    ) // List((c,8), (a,5), (d,2), (b,1))
    println(
      l2.sortWith((a, b) => a._2 > b._2)
    ) // List((c,8), (a,5), (d,2), (b,1))
    println(l2.sortWith(_._2 > _._2)) // List((c,8), (a,5), (d,2), (b,1))
  }
}
