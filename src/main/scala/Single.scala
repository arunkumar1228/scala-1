class Single {
  val value1 = 35
  val value2 = 32
}
class Derivedclass2 extends Single{
  val value3 = 54
  def Add(): Unit = {
    println("Value 1: " + value1 )
    println("Value 2: " + value2 )
    println("value of: "+ value3)
    println("Sum: " + (value1 + value2+value3))
  }
}
object MyClass extends App
 {
    val obj = new Derivedclass2()
    obj.Add()
  }

