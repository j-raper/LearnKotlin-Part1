// Declaring a Mutable Variable
fun main() {
  var todaysDate: String = "08/26/2022"
  println(todaysDate)
  var currentWeather: String
  currentWeather = "Cloudy"
  println(currentWeather)
}

// Declaring a Immutable Variable
fun main() {                  
  val pi: Double = 3.14     
  pi = 123.0              //error form because it should not be initialize again
} 

// Type Inference
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

// Using Text Variables

// Text Concatination
fun main() {
  val dog = "Toto"
  val state = "Kansas"
  val movie = "The Wizard of Oz"

  println(dog + ", I've a feeling we're not in " + state + " anymore. - " + movie + ", 1939")
}

// String Templates
fun main() {
  val plant = "orchid"
  val potSize = 6 // in inches 
  val dayNum = 7 

  println("An $plant in a $potSize inch pot must be watered every $dayNum days.")
}

// User Input
fun main() {
  println("Please type your name and hit Enter.")
  val myName = readLine()
   
  println("Your name is $myName!")
}

// Built-in Properties and Functions
fun main() {
  var word = "supercalifragilisticexpialidocious"
  word = word.capitalize()
  var wordSize = word.length

  println("$word has $wordSize letters")
}

//Character Escape Sequences
fun main() {
  // Add the correct escape sequences to the text below to achieve the output shown in the instructions 
  print("Dear Learner 👋, \n\nI hope you're enjoying the Learn Kotlin course. \nYou've made tremendous progress. Keep going! And remember, \"Knowledge is power.\" (Frances Beacon). \n\nWith love, \nCodey")
}

/*
  - Strings are sequences of characters wrapped in double-quotes.
  - A Character represents a single digit, symbol, or letter wrapped in single quotes.
  - String concatenation is the process of joining Strings using a + operator.
  - String templates are used to substitute variable values within a String using a $ symbol.
  - The readLine() function is used to accept a user’s input via the bash shell.
  - The built-in length property determines the number of characters in a String.
  - The built-in capitalize() function is used to capitalize the String onto which it’s appended.
  - Character escape sequences allow for the compiler to perform certain formatting operations on a String.
*/

// Using Number Variables

// Arithmetic Operators
fun main() {

  // Appetizer 
  val caesarSalad = 8.50

  //  Entree 
  val beefStroganoff = 18

  // Dessert 
  val cheesecake = 6
  
  var total = caesarSalad + beefStroganoff + cheesecake
  var tip = 0.15

  var finalAmount  = total * tip + total
  println(finalAmount)
}

// Order of Operations
fun main() {
  var answer1 = 7 - 5 + 4 * 3 
  var answer2 = (9 - 3) / 2 
  var answer3 = (6 + 8) + (4 - 7) 

  println(answer1)
  println(answer2)
  println(answer3)
}

// Augmented Assignment Operators
fun main() {
  var speedOfLight = 186_000
  // Write your code here 
  speedOfLight += 282

  var perfectSquare = 32
  // Write your code here 
  perfectSquare *= 2

  var sheldonsFavoriteNum = 219
  // Write your code here 
  sheldonsFavoriteNum /= 3

  var emergency = 920 
  // Write your code here 
  emergency -= 9

  var firstCountingNum = 10 
  // Write your code here 
  firstCountingNum %= 5

  println("The speed of light is ${speedOfLight}.")
  println("A perfect square is ${perfectSquare}.")
  println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
  println("The emergency number in the United States is ${emergency}.")
  println("The first counting number in programming is ${firstCountingNum}.")
}

// Increment * Decrement
fun main() {

  var a = 5 
  a += 6            // a: 11

  var b = a * 9     // b: 99
  var c = b / 3     // c: 33
  c++               // c: 34
  
  var d = c + 8     // d: 42
  d %= 4            // d: 2
  d--               // d: 1
}

//Math Library
fun main() {

  var ceil = Math.ceil(3.5)
  println(ceil)
  // returns the smallest value that is greater than or equal to the given value 3.5
  // 4.0
  
  var sqrt = Math.sqrt(25.0) 
  println(sqrt)
  // returns the square root of 25.0
  // 5.0

  var abs = Math.abs(-20) 
  println(abs)
  // returns the absolute value of -20
  // 20

  var floor = Math.floor(6.9)
  println(floor)
  // returns the largest value that is less than or equal to 6.9
  // 6.0 
}

/*
  - The Number superclass contains Int, Long, Short, Byte, Float and Double data types.
  - The arithmetic operators supported by Kotlin include +, -, *, / and %.
  - Augmented assignment operators include an arithmetic and assignment operator used to calculate and reassign a value in one step.
  - The increment operator includes two consecutive plus operators, ++, used to add 1 to a value and reassign the result.
  - The decrement operator includes two consecutive minus operators, --, used to subtract one from a value and reassign the result.
  - The order of operations includes parentheses, multiplication, division, modulus, addition and subtraction.
  - The Math library is inherited from Java and contains various mathematical functions for use in a Kotlin program.
*/






