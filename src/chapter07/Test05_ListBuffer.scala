package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    val l1 = new ListBuffer[Int]()
    val l2 = ListBuffer(1, 2, 3)
    println(l1) // ListBuffer()
    println(l2) // ListBuffer(1, 2, 3)

    l2.append(1, 2)
    println(l2) // ListBuffer(1, 2, 3, 1, 2)

    l2.insert(1, 10)
    println(l2) // ListBuffer(1, 10, 2, 3, 1, 2)

    val l3 = l2 ++ l2 // ListBuffer(1, 10, 2, 3, 1, 2, 1, 10, 2, 3, 1, 2)
    println(l3)

    l2(1) = 100
    println(l2) // ListBuffer(1, 100, 2, 3, 1, 2)
    l2.update(0, 100)
    println(l2) // ListBuffer(100, 100, 2, 3, 1, 2)

    l2.remove(4)
    println(l2) // ListBuffer(100, 100, 2, 3, 2)

    l2 -= 100
    println(l2) // ListBuffer(100, 2, 3, 2)
  }
}
