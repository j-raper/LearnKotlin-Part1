// if Expression
fun main(){
  var isTuesday = true
    
  if (isTuesday) {
    println("Take out the trash.")
  }
}

// if/else Expression
fun main() {
  var saleHappening = false
  var price: Int
  
  if (saleHappening) {
    price = 12
  } else {
    price = 15
  }
  println("The total is $price dollars.")
}

// Comparison Operators
fun main() {
  var d20 = 13

  if (d20 >= 17) {
    println("The incantation works and the dragon is defeated.")
  } else {
    println("The incantation fails and the dragon wins.")
  }
}

// Equality and Inequality Operators


// else-if Expressions
fun main() {
  var rewardsPoints = 17
  var memberType: String

  if (rewardsPoints >= 50) {
    memberType = "Platinum"
  } else if (rewardsPoints >= 25) {
    memberType = "Gold"
  } else if (rewardsPoints >= 10) {
    memberType = "Silver"
  } else {
    memberType = "Bronze"
  }
  println("You are a $memberType type member.")
} 

// Logical Operators
fun main() {
  var a = true
  var b = false
  var c = true
  var d = false

  if (a || b) {
    println("Hoorah!")
  }
  
  // This expression could also use ||
  if (!b && c) {
    println("Woohoo!")
  }

  if (a || d) {
    println("Yay!")
  }

  if (!(!d && b)) {
    println("Wow!")
  }
}

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
