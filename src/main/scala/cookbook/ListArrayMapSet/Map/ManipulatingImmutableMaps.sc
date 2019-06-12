// You want to add, update, or delete elements when working with an immutable map.

val a = Map("AL" -> "Alabama")
 // assign result to a new map

val b = a + ("AK" -> "Alaska")
val c = b + ("AR" -> "Arkansas", "AZ" -> "Arizona")

// To update a key/value pair with an immutable map,
// reassign the key and value while using the + method,
// and the new values replace the old:

val d = c + ("AR" -> "banana")

// remove

val e = d - "AR"