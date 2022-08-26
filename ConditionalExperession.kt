// Order of Evaluation
fun main() {
  var expressionValue: Boolean

  if (!true && (false && true || !false)) {
    println("Hello")
  } else {
    println("Goodbye")
  }

  expressionValue = false
  println(expressionValue)
}

// Nested Conditionals
fun main() {
  var orbitsStar = true
  var hydrostaticEquilibrium = true 
  var clearedOrbit = false
  
  if (orbitsStar && hydrostaticEquilibrium) {
    if (clearedOrbit) {
      println("Celestial body is a planet.")
    } else {
      println("Celestial body is a dwarf planet.")
    }
  } 
}

// when Expression
fun main() {
  var season = "Fall"

  when (season) {
    "Winter" -> println("Grow kale.")
    "Spring" -> println("Grow lettuce.")
    "Summer" -> println("Grow corn.")
    "Fall" -> println("Grow pumpkins.")
    else -> println("Not a valid season.")
  }
}

// Range
fun main() {
  var sHU = 17000
  var pungency: String

  if (sHU in 0..699) {
    pungency = "very mild"
  } else if (sHU in 700..2999) {
    pungency = "mild"
  } else if (sHU in 3000..24999) {
    pungency = "moderate"
  } else if (sHU in 25000..69999) {
    pungency = "high"
  } else {
    pungency = "very high"
  }

  println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")
}

/*
  - Conditional expressions control the flow of execution in a program.
  - An if expression executes a block of code when the value of its condition is true.
  - An else expression executes code when none of the previous expressions have a true value.
  - Comparison operators like >, <, >=, and <= are used to compare two values to determine a true or false value.
  - The == operator checks if two values are equivalent while the != operator checks if two values are not equivalent.
  - The logical AND operator (&&) returns true when two Boolean expressions being compared are both true.
  - The logical OR operator (||) returns true when at least one Boolean expression being compared is true.
  - The logical NOT operator (!) negates the value of a Boolean expression.
  - else-if expressions are used to add more conditions to a traditional if/else statement.
  - A nested conditional is a conditional that appears inside of another conditional.
  - A when expression evaluates the value of a variable or expression in order to dictate the flow of a program.
  - The range operator .. creates a consecutive succession of values.
