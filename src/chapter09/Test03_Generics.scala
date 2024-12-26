package chapter09

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    val child: Parent = new Child
    val childList: MyCollection[Parent] = new MyCollection[Child]
    val childList2: MyCollection2[Child] = new MyCollection2[Parent]

    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }
    // test[Parent](new Child) // error
    test[Child](new Child) // chapter09.Child
    test[Child](new SubChild) // chapter09.SubChild
    test[SubChild](new SubChild) // chapter09.SubChild
  }
}

class Parent {}
class Child extends Parent {}
class SubChild extends Child {}

class MyCollection[+E] {}
class MyCollection2[-E] {}
