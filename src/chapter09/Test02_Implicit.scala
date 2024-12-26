package chapter09

import scala.language.implicitConversions

object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    implicit def convert(num: Int): MyRichInt = new MyRichInt((num))
    println(12.myMax(15)) // 15

    println(12.myMax2(15)) // 15

    implicit val str: String = "alice"
    implicit val age: Int = 18
    def sayHello(implicit name: String) = println("hello, " + name)
    def sayHi(implicit name: String) = println("hi, " + name)
    def hiAge() = println("hi, " + implicitly[Int])
    sayHello // hello, alice
    sayHi // hi, alice
    hiAge() // hi, 18
    hiAge // hi, 18
  }

  implicit class MyRichInt2(val self: Int) {
    def myMax2(n: Int): Int = if (n < self) self else n
    def myMin2(n: Int): Int = if (n < self) n else self
  }
}

class MyRichInt(val self: Int) {
  def myMax(n: Int): Int = if (n < self) self else n
  def myMin(n: Int): Int = if (n < self) n else self
}
