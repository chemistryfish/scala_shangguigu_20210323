package chapter07

object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )
    val wordList = stringList.flatMap(_.split(" "))
    val top3 = wordList
      .groupBy(x => x)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(top3) // List((hello,5), (scala,3), (from,2))
  }
}
