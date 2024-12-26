package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    def describeConst(x: Any) = x match {
      case 1       => "Int one"
      case "hello" => "String hello"
      case true    => "Boolean true"
      case '+'     => "Char +"
      case _       => "match error"
    }
    println(describeConst("hello")) // String hello
    println(describeConst("quit")) // match error

    def describeType(x: Any) = x match {
      case i: Int             => "Int " + i
      case s: String          => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int]  => "Array[Int] " + array.mkString(",")
      case a                  => "something else: " + a
    }
    println(describeType(35)) // Int 35
    println(describeType(List("hi", "hello"))) // List List(hi, hello)
    println(describeType(List(2, 3))) // List List(2, 3)
    println(
      describeType(Array("hi", "hello"))
    ) // something else: [Ljava.lang.String;@47f6473
    println(describeType(Array(2, 3))) // Array[Int] 2,3

    for (
      arr <- List(
        Array(0), // Array(0)
        Array(1, 0), // Array(1, 0)
        Array(0, 1, 0), // Array(0, _*)
        Array(1, 1, 0), // Array(x, 1, z)
        Array(2, 3, 7, 15), // something else
        Array("hello", 20, 30) // something else
      )
    ) {
      val result = arr match {
        case Array(0)       => "Array(0)"
        case Array(1, 0)    => "Array(1, 0)"
        case Array(x, y)    => "Array(x, y)"
        case Array(0, _*)   => "Array(0, _*)"
        case Array(x, 1, z) => "Array(x, 1, z)"
        case _              => "something else"
      }
      println(result)
    }

    for (
      list <- List(
        List(0), // List(0)
        List(1, 0), // List(x, y)
        List(0, 0, 0), // List(0, _*)
        List(1, 1, 0), // something else
        List(88) // List(x)
      )
    ) {
      val result = list match {
        case List(0)     => "List(0)"
        case List(x, y)  => "List(x, y)"
        case List(0, _*) => "List(0, _*)"
        case List(x)     => "List(x)"
        case _           => "something else"
      }
      println(result)
    }

    val list = List(1, 2, 5, 7, 24)
    list match {
      case first :: second :: rest =>
        println(first + "::" + second + "::" + rest)
      case _ => println("something else")
    } // 1::2::List(5, 7, 24)

    for (
      tuple <- List(
        (0, 1), // 0, 1
        (0, 0), // 0, 0
        (0, 1, 0), // (a, 1, _)
        (0, 1, 1), // (a, 1, _)
        (1, 23, 56), // something else
        ("hello", true, 0.5) // something else
      )
    ) {
      val result = tuple match {
        case (a, b)    => "" + a + ", " + b
        case (0, _)    => "(0, _)"
        case (a, 1, _) => "(a, 1, _)"
        case _         => "something else"
      }
      println(result)
    }
  }
}
