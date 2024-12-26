package chapter07

object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result = (1 to 5).map(x => Thread.currentThread.getName)
    println(result) // Vector(main, main, main, main, main)

    val result2 = (1 to 5).map(x => Thread.currentThread.getId)
    println(result2) // Vector(1, 1, 1, 1, 1)

//    val result3: ParSeq[Long] =
//      (1 to 5).par.map(x => Thread.currentThread.getId)
//    println(result3) // Vector(20, 20, 17, 15, 23)
  }
}
