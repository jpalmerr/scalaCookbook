// FUNCTION LITERALS

// you want to use an anonymous function
// so you can pass it into a method that takes a function
// or to assign it to a variable

val x = List.range(1, 10)

val evens = x.filter((i: Int) => i % 2 == 0) // example of anon function

// using functions as variables

val double = (i: Int) => { i * 2}
double(2)
val list = List.range(1, 5)

list.map(double) // 2, 4, 6, 8b