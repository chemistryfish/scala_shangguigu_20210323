package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 2, 3)
    println(l1) // List(1, 2, 3)

    println(l1(1)) // 2
    // l1(1) = 20 // error

    println(10 +: l1 :+ 30) // List(10, 1, 2, 3, 30)

    println(30 :: l1) // List(30, 1, 2, 3)
    // println(l1 :: 30)

    val l2 = 1 :: 2 :: 3 :: Nil
    println(l2) // List(1, 2, 3)

    val l3 = l1 :: l2
    println(l3) // List(List(1, 2, 3), 1, 2, 3)

    val l4 = l1 ::: l2
    println(l4) // List(1, 2, 3, 1, 2, 3)

    val l5 = l1 ++ l2
    println(l5) // List(1, 2, 3, 1, 2, 3)
  }
}
