package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](5)
    val arr2 = Array(1, 2, 3, 4)
    println(arr.mkString(",")) // 0,0,0,0,0
    println(arr2.mkString(",")) // 1,2,3,4

    println(arr2(2)) // 3
    // println(arr2(4)) // error

    arr2(2) = 30
    println(arr2.mkString(",")) // 1,2,30,4

    for (i <- arr2.indices) println(arr2(i)) // 1,2,30,4
    for (i <- arr2) println(i) // 1,2,30,4

    val iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next()) // 1,2,30,4
    }

    arr2.foreach(println) // 1,2,30,4

    val newArr = 9 +: 10 +: arr2 :+ 73 :+ 74
    println(newArr.mkString(",")) // 9, 10, 1,2,30,4,73, 74
  }
}
