package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    // val s = new Student11("alice", 18) // error

    val s = Student11.newStudent("alice", 18)
    s.printInfo() // student: alice, 18, mit

    val s2 = Student11.apply("alice", 18)
    s2.printInfo() // student: alice, 18, mit

    val s3 = Student11("alice", 18)
    s3.printInfo() // student: alice, 18, mit
  }
}

// make the primary constructor private
class Student11 private (val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: $name, $age, ${Student11.school}")
  }
}

object Student11 {
  val school: String = "mit"
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
