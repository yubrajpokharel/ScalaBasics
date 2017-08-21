package com.yubraj.classes.class1

/**
  * Created by ypokhrel on 8/18/2017.
  */
object Class_1 extends App{
  val time1 = new Class1(10, 10)
  val time2 = new Class1(10, 15)

  println(s"$time1")
  println(time1.hours)


  //invocking with the . operator
  val timeDiff = time2.minus(time1)

  //without the . operator
  val timeDiff2 = time2 minus time1
  println(s"$timeDiff")
  println(s"$timeDiff2")

}
