package chapter08

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val l = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    val l2 = l.map(tuple => (tuple._1, tuple._2 * 2))

    val l3 = l.map(tuple => {
      tuple match {
        case (word, count) => (word, count * 2)
      }
    })

    val l4 = l.map({ case (word, count) => (word, count * 2) })
    println(l4) // List((a,24), (b,70), (c,54), (a,26))

    val l5 = l.map { case (word, count) => (word, count * 2) }
    println(l5) // List((a,24), (b,70), (c,54), (a,26))

    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = { case 0 =>
      0
    }
    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs)(x)
    println(abs(3)) // 3
    println(abs(0)) // 0
    println(abs(-3)) // 3
  }
}
