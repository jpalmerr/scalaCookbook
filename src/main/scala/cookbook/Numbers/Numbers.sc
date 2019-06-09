// CONVERTING BETWEEN NUMERIC TYPES

19.45.toInt // 19
19.toFloat // 19.0

// PRECISION

def ~=(x: Double, y: Double, precision: Double) = {
  if ((x-y).abs < precision) true else false
}

val a = 0.3
val b = 0.1 + 0.2
~=(a, b, 0.0001) // true

// BIG DECIMAL


val totalCostPounds = BigDecimal(150.toDouble / 100).setScale(2) // 1.50

// GENERATING RANDOM NUMBERS

val r = scala.util.Random

r.nextInt
r.nextInt(10) // limiting

// CREATING RANGE, LIST, ARRAY

var oneToTen = 1 to 10
var evens = 1 to 10 by 2

for (i <- 1 until 5) println(i)

var x = (1 to 10).toArray
var y = (1 to 10).toList