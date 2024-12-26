package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // iterate each character in the input file
    Source.fromFile("src/resources/test.txt").foreach(print)

    val writer = new PrintWriter(new File("src/resources/output.txt"))
    writer.write("hello scala from Java")
    writer.close()
  }
}
