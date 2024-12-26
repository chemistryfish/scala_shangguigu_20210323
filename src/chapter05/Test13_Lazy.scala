package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)
    println(result) // 60
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }
}
