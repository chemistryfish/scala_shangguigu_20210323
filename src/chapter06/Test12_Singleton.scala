package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val s1 = Student12.getInstance()
    val s2 = Student12.getInstance()
    println(s1) // chapter06.Student12@59a6e353
    println(s2) // chapter06.Student12@59a6e353
  }
}

// make the primary constructor private
class Student12 private (val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: $name, $age, ${Student11.school}")
  }
}

object Student12 {
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null) {
      student = new Student12("alice", 18)
    }
    return student
  }
}
