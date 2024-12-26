package chapter02

object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // val b: Byte = 130 // error
    val n: Int = 130
    val b: Byte = n.toByte
    print(b) // output: -126
  }
}
