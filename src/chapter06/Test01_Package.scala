package com {

  import com.atguigu.scala.Inner

  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in) // in
    }
  }

  package atguigu {
    package scala {
      object Inner {
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out) // out
          Outer.out = "outer"
          println(Outer.out) // outer
        }
      }
    }
  }
}

package aaa {
  package bbb {

    import com.atguigu.scala.Inner

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        println(Inner.in) // in
      }
    }
  }
}
