class Hierarchical {
  var a = 9
}

class derivedClass1 extends Hierarchical {
  def div(): Unit = {
    println("\nDerived Class 1")
    val b = 4
    println("Value of a: " + a)
    println("Value b: " + b)
    println(a/b)
  }
}

class derivedClass2 extends Hierarchical{
  def sub(): Unit = {
    val c = 3
    println("\nDerived Class 2")
    println("Value c : " + c )
    println("Value a : " + a )
    println(a - c)
  }
}
object MyClass3 extends App{
    val aa= new derivedClass1()
    aa.div()
    val bb = new derivedClass2()
    bb.sub()
  }
