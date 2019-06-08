def returnI(i: Int): Unit ={
  i match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case _ => println("hmm...")
  }
}
returnI(4)
returnI(16)

case class Person(name: String)
val person = Person("Fred")

person match {
  case Person(name) if name == "Fred" => println("Yabba Dabba Doo")
  case _ => "Watch the Flintstones"
}