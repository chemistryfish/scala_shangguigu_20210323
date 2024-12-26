package chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val s = new Student1("alice", 18)

    val result = s match {
      // case new Student("alice", 18) => "alice, 18" // error
      case Student1("alice", 18) => "alice, 18"
      case _                     => "else"
    }
    println(result) // alice, 18
  }
}

case class Student1(name: String, age: Int)
