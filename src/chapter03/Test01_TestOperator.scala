package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    val result1 = 10 / 3
    println(result1) // 3

    val result2: Double = 10 / 3
    println(result2) // 3.0

    val result3: Double = 10.0 / 3
    println(result3) // 3.3333333333333335
    println(result3.formatted("%.2f")) // 3.33

    val result4 = 10 % 3
    println(result4) // 1

    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) // true
    println(s1.eq(s2)) // compare address: false

    def m(n: Int): Int = {
      println("m is called")
      return n
    }
    val n = 1
    println((4 > 5) && (m(n) > 0)) // false, m is not called

    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    var b: Byte = 10
    // b += 1 // error
    // b++ // error
    var i: Int = 10
    i += 1 // okay

    val a = 60
    println(a << 3) // 480
    val c: Byte = 60
    println(c << 3) // 480, converted to Int thus no overflow

    val d: Short = -13
    println(d << 2) // -52
    println(d >> 2) // -4
    println(d >>> 2) // 1073741820, no sign

    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2)) // 49
    println(n1 + n2) // 49
  }
}
