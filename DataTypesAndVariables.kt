//Declaring a Mutable Variable
fun main() {
  var todaysDate: String = "08/26/2022"
  println(todaysDate)
  var currentWeather: String
  currentWeather = "Cloudy"
  println(currentWeather)
}

//Declaring a Immutable Variable
fun main() {                  
  val pi: Double = 3.14     
  pi = 123.0              //error form because it should not be initialize again
} 

//Type Inference
fun main() {
  var typeTest = true
  // Declare your variable above ⬆️
  print("${typeTest::class.simpleName}")    
}

/*
  - A variable declaration consists of a val or var keyword followed by a name, colon and data type.
  - A variable initialization occurs when a value is assigned to a variable using the assignment operator (=).
  - A variable declaration and initialization can happen simultaneously on one line or separately.
  - A mutable variable is denoted by the var keyword and represents a value that is expected to change throughout a program.
  - An immutable variable is denoted by the val keyword and represents a constant value.
  - Kotlin can infer a variable’s type through type inference.
*/
