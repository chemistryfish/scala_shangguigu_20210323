package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    // person.idCard // error, private
    // person.name // error, protected
    println(person.sex) // female
    println(person.age) // 18

    val worker = new Worker()
    worker.printInfo() // Worker: alice female 18
  }
}

class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker: ")
    // println(idCard)  // error, private
    println(s"Worker: $name $sex $age")
  }
}
