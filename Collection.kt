// List

// Creating an Immutable List
fun main() {
  var waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")

  println(waterSports)
}

// Accessing Elements in a List
fun main() {
  var unitedStatesMarathons = listOf("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")

  println(unitedStatesMarathons[1])
}

// Creating a Mutable List
fun main() {
  var openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables")

  openBroadwayShows[2] = "Wicked"

  println(openBroadwayShows) 
}

// The size Property
fun main() {
  var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")

  println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}

// List Functions
fun main() {

  val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
  
  planets.remove("Pluto")

  planets.add("Earth")

  println(planets.random())
}

/*
  - A list is a type of Kotlin Collection that contains ordered elements.
  - An immutable list is declared with listOf and indicates a list whose values cannot change throughout a program.
  - A mutable list is declared with mutableListOf and indicates a list whose values can be altered.
  - Elements within a list can be accessed using their index.
  - The size property returns the number of elements in a collection.
  - Immutable lists possess read-only functionalities, meanwhile, mutable lists support both read and write functionalities.
  - The contains() function checks if an element exists in a given list. It returns a Boolean true or false.
  - The add() function appends an element to the end of a mutable list.
  - The remove() function removes an element from a mutable list.
  - The random() function generates a random element from a given list.
*/
