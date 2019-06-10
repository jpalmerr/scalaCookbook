val fruits = Array("apple", "banana", "orange")

for (f <- fruits) println(f)

for (f <- fruits) println(f.toUpperCase)

for (i <- 0 until fruits.size) println(s"element $i is ${fruits(i)}")

fruits.size

// for yield construct

val newArray = for (e <- fruits) yield e.toUpperCase

// you can also iterate over a map

val names = Map("fname" -> "Wayne", "lname" -> "Rooney" )
names("fname")