package chapter07

object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4)
    println(l.reduce(_ + _)) // 10
    println(l.reduceLeft(_ + _)) // 10
    println(l.reduceRight(_ + _)) // 10
    println(l.sum) // 10
    println(l.fold(10)(_ + _)) // 20
    println(l.foldLeft(10)(_ + _)) // 20
    println(l.foldRight(10)(_ + _)) // 20

    println(l.reduce(_ - _)) // -8 = 1 - 2 - 3 - 4
    println(l.reduceLeft(_ - _)) // -8 = 1 - 2 - 3 - 4
    println(l.reduceRight(_ - _)) // -2 = 1 - (2 - (3 - 4))
  }
}
