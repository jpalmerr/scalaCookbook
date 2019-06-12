// an array with two or more dimensions

// two main solutions

// SOLUTION ONE

val rows = 2
val cols = 3

val a = Array.ofDim[String](rows, cols)
a(0)(0) = "a"
a(0)(1) = "b"
a(0)(2) = "c"
a(1)(0) = "d"
a(1)(1) = "e"
a(1)(2) = "f"
a

val c = a(0)(2)
val e = a(1)(1)

for {
  i <- 0 until rows
  j <- 0 until cols
} println(s"($i)($j) = ${a(i)(j)}")

// more dimensions

val x, y, z = 10
val dimA = Array.ofDim[Int](x,y,z)
for {
  i <- 0 until x
  j <- 0 until y
  k <- 0 until z
} println(s"($i)($j)($k) = ${dimA(i)(j)(k)}")

// SOLUTION TWO
println("++++++++++++++++++++++++++++++")

val a1 = Array( Array("a", "b", "c"), Array("d", "e", "f") )

a1(0) // Array(a, b, c)
a1(0)(0) // a
