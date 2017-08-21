package com.yubraj.basicString

/**
  * Created by ypokhrel on 4/14/2017.
  */
object String1 extends App{

  override def main(args: Array[String]) {
    var text = "Yubraj"
    val toUpperText = text.map(c => c.toUpper)
    println(toUpperText)

    val filteredText =  text.filter(_ != 'a').map(_.toUpper)
    println(filteredText)

    for(c <- text) println(c)

    val upper = for(c <- text) yield c.toUpper
    println(upper)

    val forYield = for(c <- text if c != 'a') yield c.toUpper
    println(forYield)

    text.getBytes.foreach(println)
    println(text.getClass())
  }

}
