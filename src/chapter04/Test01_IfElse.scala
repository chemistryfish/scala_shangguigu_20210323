package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("enter your age: ")
    val age = StdIn.readInt() // 20
    if (age >= 18) {
      println("adult")
    }
    println("==============")

    if (age >= 18) {
      println("adult")
    } else {
      println("not adult")
    }
    println("==============")

    if (age <= 6) {
      println("childhood")
    } else if (age < 18) {
      println("not adult")
    } else {
      println("adult")
    }
    println("==============")

    val result: Unit = if (age >= 18) {
      println("adult")
    } else {
      println("not adult")
    }
    println("result: " + result) // result: ()
    println("==============")

    val result2: String = if (age >= 18) {
      "adult"
    } else {
      "not adult"
    }
    println("result: " + result2) // result: adult
    println("==============")

    val result3: String = if (age >= 18) "adult" else "not adult"
    println("result: " + result3) // result: adult
    println("==============")

    val result4: Any = if (age >= 18) age else "not adult"
    println("result: " + result4) // result: 20
    println("==============")
  }
}
