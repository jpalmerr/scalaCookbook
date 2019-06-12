import scala.collection.mutable.ArrayBuffer
var characters1 = ArrayBuffer[String]()
characters1 += "Ben"
characters1 += "Jerry"
characters1 += "Dale"

// initialize with elements
val characters = collection.mutable.ArrayBuffer("Ben", "Jerry")

// add one element
characters += "Dale"

// add two or more elements (method has a varargs parameter)
characters += ("Gordon", "Harry")

// add multiple elements with any TraversableOnce type
characters ++= Seq("Andy", "Big Ed")

// append one or more elements (uses a varargs parameter)
characters.append("Laura", "Lucy")

// deleting

import scala.collection.mutable.ArrayBuffer
val x = ArrayBuffer('a', 'b', 'c', 'd', 'e')

// remove one element
x -= 'a'

// remove multiple elements (methods defines a varargs param)
x -= ('b', 'c')