package chapter06

object Test03_Calss {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    student.name = "alice"
    println(student.name) // alice
    println(student.sex) // null
  }
}

class Student {
  var name: String = _
  var age: Int = _
  var sex: String = _
}
