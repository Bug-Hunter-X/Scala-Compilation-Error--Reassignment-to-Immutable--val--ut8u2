```scala
class MyClass(var name: String) {
  def getName(): String = name
  def setName(newName: String): Unit = {
    name = newName
  }
}

object Main extends App {
  val myObject = new MyClass("Hello")
  println(myObject.getName()) // Output: Hello
  println(myObject.name) // Output: Hello
  myObject.setName("World")
  println(myObject.getName()) // Output: World
  println(myObject.name) //Output: World
}
```