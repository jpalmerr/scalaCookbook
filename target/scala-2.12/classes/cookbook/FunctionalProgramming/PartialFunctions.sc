// partial functions are often written using case statements

val divide: PartialFunction[Int, Int] = {
  case d: Int if d != 0 => 42/ d
}

divide(1)