trait Multiple{
  var value1 ="Arun"
}

trait baseClass2{
  var value2 = "Kumar"
}

class derivedClass extends Multiple with baseClass2{
  def Ar(): Unit = {
    println("Derived Class")
    println( value1 )
    println( value2 )
    println("Add a String :"+ (value1 + value2) )
  }
}

object MyClass1 extends App{
  val object1 = new derivedClass()
    object1.Ar()
  }
