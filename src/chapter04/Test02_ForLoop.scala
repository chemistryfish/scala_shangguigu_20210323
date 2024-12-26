package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println(i) // 1, 2, 3, 4, 5
    }

    for (i <- 1 until 5) {
      println(i) // 1, 2, 3, 4
    }

    for (i <- 1 to 5 by 2) {
      println(i) // 1, 3, 5
    }

    for (i <- 1 to 5 by -2) {
      println(i) // no error but no output
    }

    for (i <- 5 to 1) {
      println(i) // no error but no output
    }

    for (i <- 5 to 1 by -1) {
      println(i) // 5, 4, 3, 2, 1
    }

    for (i <- (1 to 5).reverse) {
      println(i) // 5, 4, 3, 2, 1
    }

    // error
    //    for (i <- 1 to 5 by 0.5) {
    //      println(i)
    //    }
    for (i <- BigDecimal(1.0) to BigDecimal(3.0) by BigDecimal(0.5)) {
      println(i) // 1.0, 1.5, 2.0, 2.5, 3.0
    }

    for (i <- Range(1, 5)) {
      println(i) // 1, 2, 3, 4
    }

    for (i <- Range(1, 5, 2)) {
      println(i) // 1,3
    }

    for (i <- Array(12, 34, 56)) {
      println(i)
    }
    for (i <- List(12, 34, 56)) {
      println(i)
    }
    for (i <- Set(12, 34, 56)) {
      println(i)
    }

    for (i <- 1 to 5 if i != 2) {
      println(i) // 1, 3, 4, 5
    }
  }
}
