package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    var a: Int = 10

    // (1) 声明变量时可以省略类型
    var a1 = 10
    val b1 = 23

    // (2) 类型确定后就不能修改
    var a2 = 15 // type: Int
    // a2 = "hello"     // error

    // (3) 变量声明时必须要有初始值
    // val a3: Int      // error

    // (4) val 不可以修改, var 可以修改
    a1 = 12
    // b1 = 25          // error

    var alice = new Student("alice", 20)
    alice = new Student("Alice", 20)
    alice = null

    val bob = new Student("bob", 23)
    // bob = new Student("bob", 24)       // error
    bob.age = 24 // okay
    bob.printInfo()
  }
}
