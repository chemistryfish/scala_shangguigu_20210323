package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 10
    val b1: Long = 2353L
    // val result1: Int = a1 + b1 // error
    val result1: Int = (a1 + b1).toInt
    val result2: Long = a1 + b1

    val a2: Byte = 10
    val b2: Int = a2
    // val c2: Byte = b2 // error
    val c2: Byte = b2.toByte

    // Byte or Short are not convertible to Char
    val a3: Byte = 10
    // val b3: Char = a3 // error
    val b3: Char = 'b'
    // val c3: Byte = b3 // error
    val c3: Int = b3
    println(c3) // output: 98

    val a4: Byte = 12
    val b4: Short = a4 // okay
    // val result4: Short = a4 + b4 // error
    val result4: Int = a4 + b4 // okay

    // forced conversion
    // val n1: Int = 2.5 // error
    val n1: Int = 2.5.toInt // okay
    println(n1) // output: 2

    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println(n2) // output: 5
    println(n3) // output: 6

    // convert a value to String
    val n: Int = 27
    val s: String = n + ""

    // convert String to a value
    val m: Int = "12".toInt

    val f: Float = "12.3".toFloat
    // val f2: Int = "12.3".toInt // error
    val f2: Int = "12.3".toDouble.toInt // okay
  }
}
