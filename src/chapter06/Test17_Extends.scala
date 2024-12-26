package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    val student = new Student17("alice", 18)
    student.study() // student studies
    student.sayHi() // Hi from student alice

    val person: Person17 = new Student17("bob", 28)
    // person.study() // error
    person.sayHi() // Hi from student bob

    println(student.isInstanceOf[Student17]) // true
    println(student.isInstanceOf[Person17]) // true
    println(person.isInstanceOf[Student17]) // true
    println(person.isInstanceOf[Person17]) // true

    val person2: Person17 = new Person17("kelly", 19)
    println(person2.isInstanceOf[Student17]) // false
    println(person2.isInstanceOf[Person17]) // true

    if (person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study() // student studies
    }

    println(classOf[Student17]) // class chapter06.Student17

    println(Workday.MONDAY) // Monday
  }
}

class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println("Hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = {
    println("Hi from student " + name)
  }

  def study(): Unit = {
    println("student studies")
  }
}

object Workday extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

// executable even without "main" function
object TestApp extends App {
  println("app start") // app start
  type MyString = String
  val a: MyString = "abc"
  println(a) // abc
}
