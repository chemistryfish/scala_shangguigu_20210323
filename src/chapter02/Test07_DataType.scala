package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 127
    val a2: Byte = -128
    // val a3: Byte = 128  // error

    val a3 = 12 // default to be Int
    // val a4 = 123456789123456 // error
    // val a4: Long = 123456789123456 // error
    val a4 = 123456789123456L // okay

    val b1: Byte = 10
    val b2: Byte = 10 + 20 // also okay
    // val b3: Byte = b1 + 20 // error, compiler doesn't know whether b1 + 20 is in the range of Byte
    val b3: Byte = (b1 + 20).toByte // okay

    val d1 = 34.2245 // default to be Double
    // val f1: Float = 34.2245 // error
    val f1: Float = 34.2245f // okay

    val c1: Char = 'a'
    val c2: Char = '9'
    val c3: Char = '\t'
    val c4: Char = '\n'
    val c5: Char = '\\'
    val c6: Char = '\"'

    // char is stored as ASCII code
    val i1: Int = c1
    val c7: Char = (i1 + 1).toChar // 'b'

    val isTrue: Boolean = true

    def m1(): Unit = {
      println("m1 is called")
    }
    val a = m1() // output: "m1 is called"
    println(a) // output: "()"

    // val n: Int = null // error
    var student: Student = null
    println(student) // output: "null"

    def m2(n: Int): Int = { // Int is the common parent type for Int and Nothing
      if (n == 0)
        throw new NullPointerException() // return type: Nothing
      else
        return n // return type: Int
    }
  }
}
