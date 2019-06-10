val x = Vector(1, 2, 3)
x.foreach((i: Int) => println(i))

x.foreach(i => println(i)) // often can infer type
x.foreach(println(_))

"HELLO".foreach((c: Char) => println(c))

/** if your algorithm is only used once
  * you don't have to declare it as a method or function
  * just pass it as a function literal
   */
