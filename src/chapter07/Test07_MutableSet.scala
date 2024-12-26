package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    val s1 = mutable.Set(1, 2, 3)
    println(s1) // HashSet(1, 2, 3)

    val f1 = s1.add(11)
    println(f1 + " " + s1) // true HashSet(1, 2, 3, 11)
    val f2 = s1.add(11)
    println(f2 + " " + s1) // false HashSet(1, 2, 3, 11)

    val f3 = s1.remove(11)
    println(f3 + " " + s1) // true HashSet(1, 2, 3)

    val s2 = mutable.Set(10, 2, 3)
    val s3 = s1 ++ s2
    println(s3) // HashSet(1, 2, 3, 10)
  }
}
