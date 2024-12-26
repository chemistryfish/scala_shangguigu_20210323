package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 3, 5, 7, 2, 89)
    val l2 = List(3, 7, 2, 45, 4, 8, 19)

    println(l1.head) // 1
    println(l1.tail) // List(3, 5, 7, 2, 89)
    println(l1.last) // 89
    println(l1.init) // List(1, 3, 5, 7, 2)

    println(l1.reverse) // List(89, 2, 7, 5, 3, 1)
    println(l1.take(3)) // List(1, 3, 5)
    println(l1.takeRight(4)) // List(5, 7, 2, 89)
    println(l1.drop(3)) // List(7, 2, 89)
    println(l1.dropRight(3)) // List(1, 3, 5)

    println(l1 ::: l2) // List(1, 3, 5, 7, 2, 89, 3, 7, 2, 45, 4, 8, 19)

    val s1 = Set(1, 3, 5, 7, 2, 89)
    val s2 = Set(3, 7, 2, 45, 4, 8, 19)
    println(s1.union(s2)) // HashSet(5, 2, 45, 7, 3, 8, 19, 4, 89, 1)
    println(s1 ++ s2) // HashSet(5, 2, 45, 7, 3, 8, 19, 4, 89, 1)

    println(l1.intersect(l2)) // List(3, 7, 2)
    println(l1.diff(l2)) // List(1, 5, 89)

    println(l1.zip(l2)) // List((1,3), (3,7), (5,2), (7,45), (2,4), (89,8))
    println(l2.zip(l1)) // List((3,1), (7,3), (2,5), (45,7), (4,2), (8,89))

    println(l1.sliding(3)) // <iterator>
    // List(1, 3, 5)
    // List(3, 5, 7)
    // List(5, 7, 2)
    // List(7, 2, 89)
    for (x <- l1.sliding(3)) {
      println(x)
    }

    // List(1, 3, 5)
    // List(5, 7, 2)
    // List(2, 89)
    for (x <- l1.sliding(3, 2)) {
      println(x)
    }
  }
}
