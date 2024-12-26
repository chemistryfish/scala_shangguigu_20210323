package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // (1) 以字母或者下划线开头，后接字母、数字、下划线
    val hello: String = ""
    val Hello123 = ""
    val _abc = 123
    // val h-b = "" // error
    // val 123abc = 234 // error

    //（2）以操作符开头，且只包含操作符
    val -+/% = "hello"
    println(-+/%)

    // (3) 用反引号包括的任意字符串，即使是scala关键字也可以
    // val if = ""  // error
    val `if` = "" // okay
    println(`if`)
  }
}
