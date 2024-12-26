package chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val s = new Student14
    s.study() // student student is studying
    s.increase() // student student knowledge increased to 1
    s.play() // young people is playing
    s.increase() // student student knowledge increased to 2
    println("====================")

    val s2 = new Student14 with Talent {
      override def sing(): Unit = println("student is singing")
      override def dance(): Unit = println("student is dancing")
    }
    s2.play() // young people is playing
    s2.dance() // student is dancing
  }
}

trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

trait Talent {
  def sing(): Unit
  def dance(): Unit
}

class Student14 extends Person13 with Young with Knowledge {

  // override conflicting attribute
  override val name: String = "student"

  override def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased to $amount")
  }
}
