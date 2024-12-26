package chapter02

import scala.io.StdIn

object Test05_Stdin {
  def main(args: Array[String]): Unit = {
    println("Input your name: ")
    val name: String = StdIn.readLine()
    println("Input your age: ")
    val age: Int = StdIn.readInt()
    println(s"Welcome $age years old $name!")
  }
}
