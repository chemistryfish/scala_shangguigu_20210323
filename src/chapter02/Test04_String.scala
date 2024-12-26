package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    //（1）字符串通过 + 连接
    val name: String = "alice"
    val age: Int = 18
    println(age + " " + name)
    println(name * 3)

    //（2）printf用法
    printf("%s is %d years old\n", name, age)

    //（3）字符串模版
    println(s"${name} is ${age} years old")
    println(s"$name is $age years old")

    val num: Double = 2.3456
    println(f"The num is ${num}%5.2f") // "  2.35"

    // output: "The num is 2.3456%5.2f"
    println(raw"The num is ${num}%5.2f")

    // 三引号字符串
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
