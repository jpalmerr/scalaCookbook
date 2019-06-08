// TESTING STRING EQUALITY

val s1 = "hello"
val s2 = "h" + "ello"

s1 == s2 // true

val a = "hello"
val b = "Hello"

a.toUpperCase == b.toUpperCase // true
a.equalsIgnoreCase(b) // true

// you never check for null values when comparing strings

// CREATING MULTI LINE STRINGS

val foo = """"This is
             |a multiline
             |string.
  """".stripMargin

// SPLITTING STRINGS

"hello world".split(" ") // Array(hello, world)

"hello world".split(" ").foreach(println)
// hello
// world

val s = "eggs, milk, butter, flour"
s.split(",").map(_.trim) // Array(eggs, milk, butter, flour)

// SUB VARIABLES INTO STRINGS

val name = "Fred"
val age = 33
val weight = 200.00

println(s"$name is $age years old and weighs $weight pounds")
println(s"Age next year: ${age + 1}")
println(f"$name is $age years old and weighs $weight%.2f pounds")

// MATCH
import scala.util.matching.Regex
val numPattern = new Regex("[0-9]+")
val address = "123 Main Street 101"
val match1 = numPattern.findFirstIn(address) // Some(123)