package chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    // ArithmeticException occurs
    // finally runs
    try {
      val n = 10 / 0
    } catch {
      case e: ArithmeticException => {
        println("ArithmeticException occurs")
      }
      case e: Exception => {
        println("Exception occurs")
      }
    } finally {
      println("finally runs")
    }
  }
}
