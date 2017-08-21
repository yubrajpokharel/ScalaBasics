package com.yubraj.classes.class1

/**
  * Created by ypokhrel on 8/18/2017.
  */
case class Class1 (hours: Int, minutes: Int){

  val asMinutes: Int = hours * 60 + minutes

  def minus(class1: Class1): Int = {
    this.asMinutes - class1.asMinutes
  }

}
