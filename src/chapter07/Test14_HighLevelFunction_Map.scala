package chapter07

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenL = l.filter(_ % 2 == 0)
    println(evenL) // List(2, 4, 6, 8)

    println(l.map(_ * 2)) // List(2, 4, 6, 8, 10, 12, 14, 16, 18)
    println(l.map(x => x * x)) // List(1, 4, 9, 16, 25, 36, 49, 64, 81)

    val nestedList = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))
    println(nestedList.flatten) // List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val strings = List("hello world", "hello scala", "hello java")
    val split = strings.map(_.split(" "))
    val flattened = split.flatten
    println(flattened) // List(hello, world, hello, scala, hello, java)
    println(
      strings.flatMap(_.split(" "))
    ) // List(hello, world, hello, scala, hello, java)

    val ll = l.groupBy(_ % 2)
    println(ll) // HashMap(0 -> List(2, 4, 6, 8), 1 -> List(1, 3, 5, 7, 9))

    println(flattened.groupBy(_(0))) // HashMap(s -> List(scala), j -> List(java), h -> List(hello, hello, hello), w -> List(world))
  }
}
