// HANDLING DEFAULTS

val a = 2
val j = 2

a match {
  case 1 => println("One")
  case default => println(default)
}

j match {
  case 1 => println("One")
  case _ => println("Don't know!")
}

// MATCHING MULTIPLE CONDITIONS WITH ONE CASE STATEMENT

// several match conditions require that the same logic executed
// you'd like to use one copy of the logic

val i = 5

i match {
  case 1 | 3 | 5 | 7 | 9 => println("odd")
  case 2 | 4 | 6 | 8 | 10 => println("even")
}

def command(cmd: String) = {
  cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }
}

command("start")
command("exit")
command("mistake")

// Assigning the result of a match to a variable

def isLessThanTen(num: Int): Boolean= {
  num match {
    case x if x < 10 => true
    case _ => false
  }
}
isLessThanTen(9)
isLessThanTen(10)

// Pattern Matching

case class Person(firstName: String, secondName: String)

def echoWhatYouGaveMe(x: Any): String = x match {

  // constant patterns
  case 0 => "zero"
  case true => "true"
  case "hello" => "you said 'hello'"
  case Nil => "an empty list"

  // sequence patterns
  case List(0, _, _) => "A three-element list with 0 as first element"
  case List(1, _*) => "a list beginning with 1, having any number of elements"
  case Vector(1, _*) => "a vector starting with 1, having any number of elements"

  // tuples
  case (a, b) => s"got $a and $b"
  case (a, b, c) => s"got $a and $b and $c"

  // constructor patterns
   case Person(first, "Alexander") => s"found an Alexander, first name = $first"

  // typed patterns
  case s: String => s"you gave me this string: $s"
  case i : Int => s"you gave me this int: $i"
  case f: Float => s"thanks for the float: $f"
  case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
  case p: Person => s"person: ${p.firstName}"
  case list: List[_] => s"thanks for th list: $list"

  // default
  case _ => "Unknown"
}

echoWhatYouGaveMe(Person("James", "P"))