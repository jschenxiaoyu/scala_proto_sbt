package com.example

import com.example.proto.example.Example

object ProtoExample {
  def main(args: Array[String]): Unit = {
    val title = "Hello, World!"
    val proto = Example().withTitle(title)
    println(proto.title)
  }
}
