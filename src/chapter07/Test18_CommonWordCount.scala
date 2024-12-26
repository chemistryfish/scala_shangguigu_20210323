package chapter07

object Test18_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    val result = stringList.flatMap(kv => {
      kv._1.split(" ").map((_, kv._2))
    })

    val top3 = result
      .groupBy(_._1)
      .mapValues(x => x.map(_._2).sum)
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(top3)
  }
}
