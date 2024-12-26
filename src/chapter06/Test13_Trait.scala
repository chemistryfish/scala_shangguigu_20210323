package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val s = new Student13

    // hello from: student
    // hello from: student student
    s.sayHello()

    // student student is studying
    s.study()

    // student student is dating
    s.dating()

    // young people is playing
    s.play()
  }
}

class Person13 {
  val name: String = "person"
  var age: Int = 18
  def sayHello(): Unit = {
    println("hello from: " + name)
  }
}

trait Young {
  var age: Int // abstract
  val name: String = "young"

  def play(): Unit = {
    println("young people is playing")
  }

  def dating(): Unit // abstract
}

class Student13 extends Person13 with Young {

  // override conflicting attribute
  override val name: String = "student"

  override def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }
}
