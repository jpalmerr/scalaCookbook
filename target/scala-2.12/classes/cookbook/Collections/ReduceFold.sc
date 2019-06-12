val a = Array(12, 6, 15, 2, 20, 9)

a.reduceLeft(_ + _)
a.sum

a.reduceLeft(_ min _)
a.min

// reduce left compares through from left to right


/** foldLeft works like reduceLeft but
  * it lets seed a value to be used
  * for the first element
  */

val b = Array(1, 2, 3)

b.foldLeft(20)(_ + _)  // 26