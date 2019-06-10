val x = (1 to 10).toArray

val y = x.drop(3) // drops number of elements specified

val y1 = x.dropWhile(_ < 6) // drops while predicate is true

val y2 = x.dropRight(4) // works like drop but starts at end

val y3 = x.take(3) // extracts first n elements

val y4 = x.takeWhile(_ < 5) // returns as long as predicate true

val y5 = x.takeRight(3) // take but starts at right

// slice(from, until) // including from not including until

val peeps = List("John", "Mary", "Jane", "Fred")
peeps.slice(1, 3)