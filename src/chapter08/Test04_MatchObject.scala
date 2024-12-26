package chapter08

import chapter01.Student

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val s = new Student("alice", 18)

    val result = s match {
      // case new Student("alice", 18) => "alice, 18" // error
      case Student("alice", 18) => "alice, 18"
      case _                    => "else"
    }
    println(result) // alice, 18
  }
}

class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) None else Some((student.name, student.age))
  }
}
