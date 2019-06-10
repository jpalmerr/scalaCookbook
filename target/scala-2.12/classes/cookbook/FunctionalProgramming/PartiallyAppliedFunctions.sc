val sum = (a: Int, b: Int, c: Int) => a + b + c

val f = sum(1, 2, _) // => becomes a partially applied function
f(3) // 6

// the first two numbers have been stored in f

