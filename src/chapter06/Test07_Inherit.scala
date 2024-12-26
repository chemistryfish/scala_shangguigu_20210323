package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    // Person's primary constructor
    // Student's primary constructor
    val s1 = new Student7("alice", 18)

    // Person's primary constructor
    // Student's primary constructor
    // Student's custom constructor
    val s2 = new Student7("bob", 20, "std01")

    val teacher = new Teacher
    teacher.printInfo() // Teacher: null 0

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }
    personInfo(teacher) // Teacher: null 0
    personInfo(s1) // Student: alice 18 null
  }
}

class Person7() {
  var name: String = _
  var age: Int = _

  println("Person's primary constructor")

  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
    println("Person's custom constructor")
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

class Student7(name: String, age: Int) extends Person7 {
  var stdNo: String = _
  println("Student's primary constructor")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    this.stdNo = stdNo
    println("Student's custom constructor")
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println(s"Teacher: $name $age")
  }
}
