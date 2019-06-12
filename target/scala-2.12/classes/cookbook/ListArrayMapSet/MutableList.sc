// You want to use a mutable list, but a List isn’t mutable.

// The following examples demonstrate how to create a ListBuffer,
// and then add and remove elements, and then convert it to a List when finished:

import scala.collection.mutable.ListBuffer

var fruits = new ListBuffer[String]()

// add one element at a time to the ListBuffer
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"
// add multiple elements
fruits += ("Strawberry", "Kiwi", "Pineapple")

// remove one element
fruits -= "Apple"

// remove multiple elements
fruits -= ("Banana", "Orange")

// convert the ListBuffer to a List when you need to
val fruitsList = fruits.toList

// Because a List is immutable, if you need to create a list that is constantly changing,
// the preferred approach is to use a ListBuffer while the list is being modified,
// then convert it to a List when a List is needed