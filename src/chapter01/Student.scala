package chapter01

class Student(var name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 伴生对象
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 23)

    alice.printInfo()
    bob.printInfo()
  }
}
