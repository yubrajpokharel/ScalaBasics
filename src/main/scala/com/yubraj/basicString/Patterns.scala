package com.yubraj.basicString

/**
  * Created by ypokhrel on 4/14/2017.
  */
object Patterns extends App{

  override def main(args: Array[String]): Unit = {
    val numPattern = "[0-9]+".r
    val text = "My name is Yubraj and I am 27 years old and I have 2 powers"
    println("Find One " + numPattern.findFirstIn(text))
    val result = numPattern.findAllIn(text)
    result.foreach(println)

    val result2 = numPattern.findAllMatchIn(text)
    result2.foreach(println)

    val text2 = "My name is yubraj and I am 26 year old"
    val patternToReplace = "[0-9]".r
    println(patternToReplace.replaceAllIn(text2, "X"))
    println(patternToReplace.replaceFirstIn(text2, "X"))

    val pattern = "([0-9]+) ([A-Za-z]+)".r
    val pattern(count, fruit) = "100 banana"

  }

}
