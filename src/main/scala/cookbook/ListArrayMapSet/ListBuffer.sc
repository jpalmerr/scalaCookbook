// If you’re going to be modifying a list frequently,
// it may be better to use a ListBuffer instead of a List.
// A ListBuffer is mutable

import scala.collection.mutable.ListBuffer
val x = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)

// delete by value
x -= 5

// delete two or more elements at once
x -= (2, 3)

// delete elements by position
x.remove(0) // 1
x

// You can use remove to delete from a given starting
// position and provide the number of elements to delete

x.remove(1, 3)
println("+++++++++")
x

