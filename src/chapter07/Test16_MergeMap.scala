package chapter07

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val m1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val m2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)
    println(m1 ++ m2) // Map(a -> 6, b -> 2, c -> 9, d -> 3)
    println(m2 ++ m1) // Map(a -> 1, b -> 3, c -> 6, d -> 3)

    val m3 = m1.foldLeft(m2)((mergedMap, kv) => {
      mergedMap(kv._1) = mergedMap.getOrElse(kv._1, 0) + kv._2
      mergedMap
    })
    println(m3) // HashMap(a -> 7, b -> 5, c -> 15, d -> 3)
  }
}
