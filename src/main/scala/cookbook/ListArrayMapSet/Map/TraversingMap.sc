val ratings = Map("Lady in the Water"-> 3.0,
  "Snakes on a Plane"-> 4.0,
  "You, Me and Dupree"-> 3.5)

for ((k,v) <- ratings) println(s"key: $k, value: $v")

ratings.foreach {
  case(movie, rating) => println(s"key: $movie, value: $rating")
}

// keys
ratings.keys.foreach(movie => println(movie))

// operating on maps

// If you want to traverse the map to perform
// an operation on its values,
// the mapValues method may be a better solution.

val y = ratings.mapValues(_*2)

// You want to get all of the keys or values from a map

