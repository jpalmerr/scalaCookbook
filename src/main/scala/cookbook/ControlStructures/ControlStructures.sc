// IMPLEMENTING BREAK AND CONTINUE

// need to use break or continue construct
// but scala does not offer these keywords

import util.control.Breaks._

object BreakAndContinueDemo {
  println("\n=== BREAK EXAMPLE ===")

  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i > 4) break // break out of for loop
    }
  }

  println("\n=== CONTINUE EXAMPLE ===")

  val searchMe = "peter piper picked a peck of pickled peppers"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    breakable {
      if (searchMe.charAt(i) != 'p') {
        break // break out of breakable, continue outside the loop
      } else {
        numPs += 1
      }
    }
  }
  println("Found " + numPs + "p's in the string.")
}

BreakAndContinueDemo

// break method reached
// exception thrown
// exception caught by breakable
// loop can continue executing