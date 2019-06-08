// defining a method that returns a tuple

def getStockInfo = {
  // other code..
  ("NFLX", 100.00, 101.00) // tuple
}

val (symbol, currentPrice, bidPrice) = getStockInfo

// bit like my shop tech test

import scala.math.Integral.Implicits._
val (quotient, remainder) = 11 /% 2