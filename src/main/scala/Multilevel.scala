class Multilevel {
  var value1 = 3
}

class class2 extends Multilevel {
  val value2 = 4
}
class class3 extends class2{
  def Mul(): Unit = {
    println("Value 1: " + value1 )
    println("Value 2: " + value2 )
    println("Sum: " + (value1*value2))
  }
}
object MyClass2 extends App {
    val ar = new class3()
    ar.Mul()
}