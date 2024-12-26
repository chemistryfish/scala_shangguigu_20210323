package chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student = new Student1 // default constructor is called
    student.Student1() // a regular method (not constructor) is called

    // default constructor is called
    // custom constructor(name) is called
    val student2 = new Student1("alice")

    // default constructor is called
    // custom constructor(name) is called
    // custom constructor(name, age) is called
    val student3 = new Student1("alice", 18)
  }
}

class Student1() {
  var name: String = _
  var age: Int = _
  println("default constructor is called")

  def this(name: String) {
    this()
    this.name = name
    println("custom constructor(name) is called")
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
    println("custom constructor(name, age) is called")
  }

  def Student1() {
    println("a regular method (not constructor) is called")
  }
}
