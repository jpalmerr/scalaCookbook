/**
  * This is the "x2 = x1 - f(x1)/f'(x1)" calculation
  */

def newtonsMethodHelper(fx: Double => Double,
                        fxPrime: Double => Double,
                        x: Double): Double = {
  x - fx(x)/ fxPrime(x)
}

/**
  * Newton's method for solving equations
  * @todo check that |f(xNext)| > second tolerance value
  * @todo check that f'(x) != 0
  */

def newtonsMethod(fx: Double => Double,
                  fxPrime: Double => Double,
                  x: Double,
                  tolerance: Double): Double = {
  var x1 = x
  var xNext = newtonsMethodHelper(fx, fxPrime, x1)
  while (math.abs(xNext - x1) > tolerance) {
    x1 = xNext
    println(xNext) // helps debugging
    xNext = newtonsMethodHelper(fx, fxPrime, x1)
  }

  xNext
}

/**
  A driver function to test Newton's Method
  Start with (a) the desired f(x) and f'(x) eqns
  (b) an initial guess
  (c) tolerance values
  */

def driver: Unit = {
  // the f(x) and f'(x) functions
  val fx = (x: Double) => 3*x + math.sin(x) - math.pow(math.E, x)
  val fxPrime = (x: Double) => 3 + math.cos(x) - math.pow(Math.E, x)

  val initialguess = 0.0
  val tolerance = 0.00005

  // pass f(x) and f'(x) to the Newton's Method function
  // along with initial guess and tolerance

  val answer = newtonsMethod(fx, fxPrime, initialguess, tolerance)

  println(answer)
}

object NewtonsMethod {
  def main(args: Array[String]): Unit = {
    driver
  }
}