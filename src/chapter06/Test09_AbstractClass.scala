package chapter06

object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val s = new Student9

    // person eats
    // student eats
    s.eat()

    // student sleeps
    s.sleep()
  }
}

abstract class Person9 {
  // this attribute is not abstract
  val name: String = "person"

  // this attribute is abstract
  var age: Int

  // regular method
  def eat(): Unit = {
    println("person eats")
  }

  // abstract method
  def sleep(): Unit
}

class Student9 extends Person9 {
  var age: Int = 18

  def sleep(): Unit = {
    println("student sleeps")
  }

  // override regular attributes and methods
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eats")
  }
}
