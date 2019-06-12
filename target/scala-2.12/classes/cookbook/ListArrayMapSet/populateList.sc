val list = 1 :: 2 :: 3 :: Nil
val list1 = List(1, 2, 3)

val x = List(1, 2.0, 33D, 4000L)
val x1 = List[Number](1, 2.0, 33D, 4000L)


val y = List.range(1, 10)
val y1 = List.range(0, 10, 2) // very cool


val z = List.fill(3)("foo")


val a = List.tabulate(5)(n => n * n)
// List(0, 1, 4, 9, 16)

"foo".toList
// List(f, o, o)