// you want to match different case classes in a match expression

trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Woodpecker extends Animal

def determineType(x: Animal): String = x match {
  case Dog(name) => s"Got a dog, name = $name"
  case _:Cat => "got a cat, ignoring name"
  case Woodpecker => "that was a woodpecker"
  case _ => "Something else"
}

determineType(Dog("Rover"))
determineType(Cat("Kitty"))
determineType(Woodpecker)