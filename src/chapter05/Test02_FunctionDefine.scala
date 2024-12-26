package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("1. no parameter and no return")
    }
    f1()
    println(f1())
    println("================")

    def f2(): Int = {
      println("2. no parameter but have return")
      return 12
    }
    f2()
    println(f2())
    println("================")

    def f3(name: String): Unit = {
      println("3. have parameter but no return" + name)
    }
    f3("alice")
    println(f3("alice"))
    println("================")

    def f4(name: String): String = {
      println("4. have parameter and return" + name)
      return "hi, " + name
    }
    f4("alice")
    println(f4("alice"))
    println("================")
  }
}
