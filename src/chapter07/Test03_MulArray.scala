package chapter07

object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)

    array(0)(2) = 19
    array(1)(0) = 25

    /*
      0	    0	19
      25	0	0
     */
    for {
      i <- array.indices
      j <- array(i).indices
    } {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) println()
    }

    // array.foreach(row => row.foreach(println))
    array.foreach(_.foreach(println))
  }
}
