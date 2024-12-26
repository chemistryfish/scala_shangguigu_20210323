package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    val m1: Map[String, Int] = Map("a" -> 13, "b" -> 25)
    println(m1) // Map(a -> 13, b -> 25)
    println(m1.getClass) // class scala.collection.immutable.Map$Map2

    // (a,13)
    // (b,25)
    m1.foreach(println)

    // (a,13)
    // (b,25)
    m1.foreach((kv: (String, Int)) => println(kv))

    // a --> Some(13)
    // b --> Some(25)
    for (key <- m1.keys) {
      println(s"$key --> ${m1.get(key)}")
    }

    println(m1.get("a").get) // 13
    println(m1.get("c")) // None
    println(m1("a")) // 13
    // println(m1("c")) // error
    println(m1.getOrElse("c", 0)) // 0
  }
}
