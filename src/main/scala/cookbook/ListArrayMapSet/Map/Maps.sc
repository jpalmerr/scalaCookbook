// creating maps

val states = Map("AL" -> "Alabama", "AK" -> "Alaska")

// immutable as default ^

var states2 = collection.mutable.Map("AL" -> "Alabama")
// mutable
states2 += ("AK" -> "Alaska")

import scala.collection.SortedMap

val grades = SortedMap("Kim" -> 90,
   "Al" -> 85,
 "Melissa" -> 95,
 "Emily" -> 91,
 "Hannah" -> 92
 )

// scala has a wealth of map types
// => worth looking at


/*
if you want to add, remove, or update elements
you need a mutable map
 */

var moreStates = scala.collection.mutable.Map[String, String]()

// add
moreStates("AK") = "Alaska"
moreStates += ("AL" -> "Alabama")
moreStates += ("AR" -> "Arkansas", "AZ" -> "Arizona")

// remove
moreStates -= "AR"
moreStates -= ("AL", "AZ")
// moreStates --= List("AL", "AZ")

// update

moreStates("AK") = "Alaska, A Really Big State"
moreStates