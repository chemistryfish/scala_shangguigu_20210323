package chapter05

object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    def f0000(name: String): String = {
      return name
    }
    println(f0000("alice")) // alice

    def f000(name: String): String = return name
    println(f000("alice")) // alice

    def f00(name: String) { return name }
    println(f00("alice")) // ()

    // a process without return
    def g00(name: String) { println(name) }
    g00("alice") // alice

    def f0(name: String): String = {
      name
    }
    println(f0("alice")) // alice

    def f1(name: String) = {
      name
    }
    println(f1("alice")) // alice

    def f2(name: String) = name
    println(f2("alice")) // alice

    // error
    // method has return statement; needs result type
    //    def f3(name: String) = {
    //      return name
    //    }

    // error
    //    def f4(name): String = name

    // error
    //    def f5(name) = name

    def f6(name: String): Unit = {
      return name
    }
    println(f6("alice")) // ()

    def f7(): Unit = {
      println("hello")
    }
    f7() // hello
    f7 // hello

    def f8: Unit = {
      println("hello")
    }
    // f8() // error
    f8 // hello

    // lambda function
    val f9 = (name: String) => { println(name) }
    f9("alice") // alice

    def f(func: String => Unit): Unit = {
      func("bob")
    }
    f(f9) // bob
    f((name: String) => { println(name) }) // bob
    f(name => println(name)) // bob
    f(println(_)) // bob
    f(println) // bob
  }
}
