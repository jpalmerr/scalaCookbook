val a = Array(1, 2, 3, 4, 5)

// you can create a copy by yielding each element

for (e <- a) yield e
for (e <- a) yield e*2
for (e <- a) yield e % 2

// map

val helpers = Vector("adam", "kim", "melissa")
val caps = helpers.map(e => e.capitalize)
val caps1 = helpers.map(_.capitalize)

val names = Array("Fred", "Joe", "John")
val lengths = names.map(_.length)

// map better when need a guard

val fruits = List("apple", "banana", "lime", "orange", "raspberry")
fruits.filter(_.length < 6).map(_.toUpperCase)

// Lists

// flattening a list of lists

val lol = List(List(1, 2), List(3, 4))
val result = lol.flatten // works on arrays too

// example in real world..
val myFriends = List("Adam", "David", "Frank")
val adamsFriends = List("Nick K", "Bill M")
val davidsFriends = List("Becca G", "Kenny D", "Bill M")
val friendsOfFriends = List(adamsFriends, davidsFriends) // list of lists

val uniqueFriendsOfFriends = friendsOfFriends.flatten.distinct

// distinct finds unique characters etc
"hello world".distinct // helo wrd