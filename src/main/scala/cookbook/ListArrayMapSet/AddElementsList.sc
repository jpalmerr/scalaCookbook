// You want to add elements to a List that you’re working with.

/*
“How do I add elements to a List?” is a bit of a trick question,
 because a List is immutable, so you can’t actually add elements to it.
 If you want a List that is constantly changing, use a ListBuffer (as described in Recipe 11.2),
  and then convert it to a List when necessary.

To work with a List, the general approach is to prepend items to the list
 with the :: method while assigning the results to a new List:
 */

val x = List(2)
val y = 1 :: x
val z = 0 :: y

// deleting elements

// A List is immutable, so you can’t delete elements from it,
// but you can filter out the elements you don’t want
// while you assign the result to a new variable

val originalList = List(5, 1, 4, 3, 2)
val newList = originalList.filter(_ > 2)

// can assign to a var but try to avoid vars where possible

