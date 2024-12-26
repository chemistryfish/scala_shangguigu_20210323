package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    val s1 = Set(1, 2, 3, 2)
    println(s1) // Set(1, 2, 3)

    val s2 = s1 + 10
    println(s2) // Set(1, 2, 3, 10)

    val s3 = Set(2, 11, 4)
    // val s4 = s2 + s3 // error
    val s4 = s2 ++ s3
    println(s4) // HashSet(10, 1, 2, 3, 11, 4)

    val s5 = s4 - 11
    println(s5) // HashSet(10, 1, 2, 3, 4)
  }
}
