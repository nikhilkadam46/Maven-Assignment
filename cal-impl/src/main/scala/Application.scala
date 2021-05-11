class Application {
  val obj= new Calculator
}
object Main
{
  def main(args: Array[String]):Unit =
  {
    val calc = new Application

    println("Addition: " + calc.obj.+(46, 5))
    println("Subtraction: " + calc.obj.-(100, 1))
    println("Multiplication: " + calc.obj.*(7, 7))
    println("Division: " + calc.obj./(1000, 2))
  }

}
