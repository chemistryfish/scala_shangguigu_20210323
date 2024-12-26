package chapter05

object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (x <- array) yield op(x)
    }
    println(arrayOperation(Array(1, 2, 3), _ * 2).mkString(",")) // 2, 4, 6

    println(Array(1, 2, 3).map(_ * 2).mkString(",")) // 2, 4, 6
  }
}
