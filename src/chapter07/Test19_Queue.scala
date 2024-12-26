package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val q: mutable.Queue[String] = new mutable.Queue()
    q.enqueue("a", "b", "c")
    println(q) // Queue(a, b, c)
    println(q.dequeue()) // a
    println(q) // Queue(b, c)
    println(q.dequeue()) // b

    q.enqueue("d", "e")
    println(q) // Queue(c, d, e)

    // immutable queue
    val q2 = Queue("a", "b", "c")
    q2.enqueue("d")
    println(q2) // Queue(a, b, c)
    println(q2.enqueue("d")) // Queue(a, b, c, d)
  }
}
