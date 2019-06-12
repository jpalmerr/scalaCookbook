val states = Map("AK" -> "Alaska", "AL" -> "Alabama", "AR" -> "Arkansas", "KY" -> "Kentucky")

// get keys

// keySet to get the keys as a Set
states.keySet

// keys to get an Iterable
states.keys

// keysIterator to get the keys as an iterator
states.keysIterator

// get values

states.values

// reversing keys and values

val products = Map(
  "Breadsticks" -> "$5",
  "Pizza" -> "$10",
  "Wings" -> "$5"
)

val reverseMap =
  for ((k,v) <- products) yield (v, k)

// test existence

if (states.contains("FOO")) println("Found foo")
else println("No foo")

states.valuesIterator.exists(_.contains("ucky")) // boolean true
states.valuesIterator.exists(_.contains("yucky")) // boolean false

// filter

val x = Map(1 -> "a", 2 -> "b", 3 -> "c")

val y = x.filterKeys(_ > 2) // Map(3 -> c)


val m = Map(1 -> "a", 2 -> "b", 3 -> "c")

// access the key
m.filter(t => t._1 > 1)
// access the value
m.filter(t => t._2 == "c")
