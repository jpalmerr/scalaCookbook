// creates new collection that contains only elements
// that match your filtering collection

val x = List.range(1, 10)
val evens = x.filter(_ % 2 == 0)

val fruits = Set("orange", "peach", "apple", "banana")
val a = fruits.filter(_.startsWith("a"))
val y = fruits.filter(_.length > 5)

val list = "apple" :: "banana" :: 1 :: 2 :: Nil
val strings = list.filter {
  case s: String => true
  case _ => false
}
