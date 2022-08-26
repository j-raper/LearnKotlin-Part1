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

// Sets

// Creating an Immutable Set
fun main() {
 var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")
 
 println(obsoleteTech)
}

// Accessing Elements in a Set
fun main() {
  var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")
  
  println(islandsOfHawaii.elementAt(2))

  println(islandsOfHawaii.elementAtOrNull(6)) 
}

// Creating a Mutable Set
fun main() {
  var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")

  println(apolloLandingSites)
}

// Adding and Removing Elements
fun main() {

  var uniqueParticipants = mutableSetOf<String>() 
  var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

  uniqueParticipants.addAll(participants)

  println("The talent show has ${uniqueParticipants.size} unique participants.")

  uniqueParticipants.clear()

  println(uniqueParticipants)
}

// Additional Set Functions
fun main() {
  var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)

  var sum = testGrades.sum()

  var numStudents = testGrades.size

  var average = sum / numStudents

  if (average < 65) {
    println("Failed") 
  } else {
    println("Passed")
  }
}

/*
  - A set is an unordered Kotlin collection that stores unique elements.
  - An immutable set is declared with the setOf keyword and indicates a set whose values cannot change throughout a program.
  - A mutable set is declared with the mutableSetOf keyword and indicates a set whose values can be altered.
  - Elements within a set can be accessed using the elementAt() or elementAtOrNull() functions.
  - The addAll() and add() functions are used to add elements to a collection.
  - The first() and last() functions return the first and last elements of a collection.
  - The clear() function removes all elements from a collection.
  - You’ve now covered the second major collection that exists in Kotlin as well as many other programming languages. Feel free to utilize the empty Review.kt file and output terminal on the right to hone your understanding of sets and practice writing Kotlin code.
*/

// Maps

// Creating an Immutable Map
fun main() {
  var codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")

  println(codeysMap)
}

// Retrieving Keys and Values
fun main() {
  var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")

  println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
  println(uniqueTransport.keys)
  println(uniqueTransport.values)
}

// Creating a Mutable Map
fun main() {
  var tvShows = mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)

  tvShows["The Big Bang Theory"] = 279
  println(tvShows)
}

// Adding and Removing Entries
fun main() {
  var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

  if (!momaPaintings.containsValue("Claude Monet")) {
    // Write your code for Step 1 here 
    momaPaintings.put("Water Lillies", "Claude Monet")
  }

    // Write your code for Step 2 here
  momaPaintings.remove("Mona Lisa")
  println(momaPaintings)
}

/*
- A map is a collection that stores key-value pairs of data.
- The keys within a map must be unique, however, the values can duplicate.
- An immutable map is declared with the mapOf keyword and indicates a map whose entries cannot change throughout a program.
- A mutable map is declared with the mutableMapOf keyword and indicates a Map whose entries can be altered.
- Values within a map can be accessed using shorthand [key] syntax.
- To return all the values in a map, use the values property. To return all the keys in a map, use the keys property.
- The put() function accepts a key and a value to add to a map.
- The remove() function accepts a key and removes the entry associated with that key.
*/






