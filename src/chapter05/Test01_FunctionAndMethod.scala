package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {

    // function
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }
    sayHi("alice") // hi, alice
    Test01_FunctionAndMethod.sayHi("alice") // Hi, alice
  }

  // method
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }
}
