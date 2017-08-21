/**
  * Created by yubrajpokharel on 5/30/17.
  */
object Switch {

  def main(args: Array[String])  {
    var i = 4
    i match {
       case 3 => println("3")
       case 2 => println("2")
       case oops => println("you give me default "+ oops)
       }

    

  }

}
