package chapter08

object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    val x = 2
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    val a = 1
    val b = 2
    def matchDualOp(op: Char): Any = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _   => "invalid operation"
    }
    println(matchDualOp('+')) // 3
    println(matchDualOp(':')) // invalid operation

    def abs(num: Int) : Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(3))
    println(abs(0))
    println(abs(-3))
  }
}
