val v = Vector("a", "b", "c")
v(0)

// you can't modify a vector => you create a new one

val a = Vector(1, 2, 3)
val b = a ++ Vector(4, 5)
val c = v.updated(0, "x") // xbc

// filtering methods

val a1 = Vector(1, 2, 3, 4, 5)
val b1 =a1.take(2) // (1, 2)

val c1 = a1.filter(_ > 2) // 3, 4, 5

