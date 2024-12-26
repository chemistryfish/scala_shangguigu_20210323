package chapter06

object Test10_AnonymousClass {
  def main(args: Array[String]): Unit = {
    val person = new Person10 {

      override var name: String = "alice"

      override def eat(): Unit = {
        println("person eats")
      }
    }
    person.eat() // person eats
  }
}

abstract class Person10 {
  var name: String
  def eat(): Unit
}
