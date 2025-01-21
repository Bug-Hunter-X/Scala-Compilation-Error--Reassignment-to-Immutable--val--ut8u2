```scala
class MyClass(val name: String) {
  def getName(): String = name
}

object Main extends App {
  val myObject = new MyClass("Hello")
  println(myObject.getName()) //Correct Output: Hello
  println(myObject.name) //Correct output: Hello
  println(myObject.name = "World") //Compilation error: reassignment to val
}
```