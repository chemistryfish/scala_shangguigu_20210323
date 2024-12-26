package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    val m1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 25)
    println(m1) // HashMap(a -> 13, b -> 25)
    println(m1.getClass) // class scala.collection.mutable.HashMap

    m1.put("c", 5)
    m1.put("b", 9)
    println(m1) // HashMap(a -> 13, b -> 9, c -> 5)

    m1 += (("d", 7))
    println(m1) // HashMap(a -> 13, b -> 9, c -> 5, d -> 7)

    m1.remove("c")
    println(m1) // HashMap(a -> 13, b -> 9, d -> 7)
    println(m1.getOrElse("c", 0)) // 0

    m1 -= "b"
    println(m1) // HashMap(a -> 13, d -> 7)

    m1.update("a", 130)
    println(m1) // HashMap(a -> 130, d -> 7)

    m1 += (("a", 1300))
    println(m1) // HashMap(a -> 1300, d -> 7)

    m1 ++= Map("a" -> 13, "b" -> 25)
    println(m1) // HashMap(a -> 13, b -> 25, d -> 7)
  }
}
