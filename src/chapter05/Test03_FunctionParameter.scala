package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice") // ArraySeq(alice)
    f1("aaa", "bbb", "ccc") // ArraySeq(aaa, bbb, ccc)

    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("alice") // str1: alice str2: List()
    f2("aaa", "bbb", "ccc") // str1: aaa str2: ArraySeq(bbb, ccc)

    def f3(name: String = "alice"): Unit = {
      println(name)
    }
    f3("bob") // bob
    f3() // alice

    def f4(name: String, age: Int): Unit = {
      println(s"${name} is ${age} years old.")
    }
    f4("alice", 20) // alice is 20 years old.
    f4(age = 20, name = "alice") // alice is 20 years old.
  }
}
