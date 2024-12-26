package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val s = new Student15
    // talent increased
    // student increased
    s.increase()

    // diamond inheritance structure
    val b = new MyFootBall
    println(b.describe()) // my ball is a red-foot-ball
  }
}

trait Ball {
  def describe(): String = "ball"
}

trait ColorBall extends Ball {
  var color: String = "red"
  override def describe(): String = {
    color + "-" + super.describe()
  }
}

trait CategoryBall extends Ball {
  var category: String = "foot"
  override def describe(): String = {
    category + "-" + super.describe()
  }
}

class MyFootBall extends CategoryBall with ColorBall {
  // override the conflicting method
  override def describe(): String = {
    "my ball is a " + super.describe()
  }
}

trait Knowledge15 {
  var amount: Int = 0
  def increase() = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def sing(): Unit
  def dance(): Unit
  def increase() = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Knowledge15 with Talent15 {
  override def sing(): Unit = println("singing")
  override def dance(): Unit = println("dancing")

  // override the conflicting method
  override def increase(): Unit = {
    super.increase() // call the last: Talent15.increase()
    println("student increased")
  }
}
