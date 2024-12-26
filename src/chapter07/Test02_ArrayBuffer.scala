package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(1, 2, 3)
    println(arr1) // ArrayBuffer()
    println(arr2) // ArrayBuffer(1, 2, 3)
    println(arr2.toString) // ArrayBuffer(1, 2, 3)

    println(arr2(1)) // 2
    arr2(1) = 20
    println(arr2) // ArrayBuffer(1, 20, 3)

    arr2.append(100)
    arr2.prepend(99)
    println(arr2) // ArrayBuffer(99, 1, 20, 3, 100)

    arr2.insert(1, 98)
    println(arr2) // ArrayBuffer(99, 98, 1, 20, 3, 100)

    arr2.appendAll(Array(1,2, 3)) // ArrayBuffer(99, 98, 1, 20, 3, 100, 1, 2, 3)
    println(arr2)

    arr2.remove(1)
    println(arr2) // ArrayBuffer(99, 1, 20, 3, 100, 1, 2, 3)

    arr2.remove(0, 4)
    println(arr2) // ArrayBuffer(100, 1, 2, 3)

    arr2.append(2)
    arr2 -= 2
    println(arr2) // ArrayBuffer(100, 1, 3, 2)
    arr2 -= 99
    println(arr2) // ArrayBuffer(100, 1, 3, 2)

    val newArr = arr2.toArray // convert to immutable
    println(newArr.mkString(",")) // 100,1,3,2

    println(newArr.toBuffer) // convert to mutable
  }
}
