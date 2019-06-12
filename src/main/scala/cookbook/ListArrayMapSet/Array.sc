val a1 = Array(1,2,3)
val fruits = Array("Apple", "Banana", "Orange")
// scala can infer type

// You can define an array with an initial size and type, and then populate it later
val fruit = new Array[String](3)
// somewhere later in the code ...
fruit(0) = "Apple"
fruit(1) = "Banana"
fruit(2) = "Orange"
fruit

// some other ways to populate

val x = Array.range(1, 10)
val x1 = Array.range(0, 10, 2)
val x2 = Array.fill(3)("foo")
val x3 = Array.tabulate(5)(n => n * n)
val x4 = List(1,2,3).toArray
"Hello".toArray


/*
The size of an Array can’t be changed,
so you can’t directly delete elements.
You can reassign the elements in an Array,
 which has the effect of replacing them:
 */
val a = Array("apple", "banana", "cherry")

a(0) = ""
a(1) = null
a(2) = "pear"
a

/*
filter elements out of one array while you
assign the result to a new array
 */

val firstArray = Array("apple", "banana", "orange")
val secondArray = firstArray.filter(!_.contains("apple"))
val takeFirstTwo = firstArray.take(2)