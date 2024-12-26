package chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val s1 = new Student2
    s1.name = "alice"
    println(s1.name) // alice

    val s2 = new Student3("alice", 18)
    println(s2.name) // alice

    val s3 = new Student4("alice", 18, "mit")
    println(s3.school) // mit
  }
}

class Student2 {
  var name: String = _
  var age: Int = _
}

class Student3(var name: String, var age: Int)

class Student4(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }
}
