trait BaseSoundPlayer {
  def play = {
    println("playing..")
  }
  def pause = {
    println("paused..")
  }
}

class MP3SoundPlayer extends BaseSoundPlayer

val mp3 = new MP3SoundPlayer
mp3.play

// USING ABSTRACT AND CONCRETE FIELDS IN TRAITS

// define a field with an initial trait to make concrete otherwsie abstract

trait PizzaTrait {
  var numToppings: Int // abstract
  var size = 14 // concrete
  val maxNumToppings = 10 // concrete
}

// USING A TRAIT LIKE AN ABSTRACT CLASS

// in the class that extends the trait, you can override those methods
// or use them as defined in trait

trait Pet {
  def speak { println("hello") } // concrete implementation
  def comeToMaster // abstract method
}

class Dog extends Pet {
  // don't need to implement speak if you don't need to
  def comeToMaster{ println("I'm coming")}

}

class Cat extends Pet {
  // override the speak method
  override def speak { println("meow")}
  def comeToMaster { println("That's not going to happen") }
}

// if a class extends a trait without implementing its abstract methods
// it must be declared abstract

// flying pet does not implement comeToMaster
abstract class FlyingPet extends Pet {
  def fly { println("I'm flying")}
}

val dog = new Dog
dog.speak // hello
dog.comeToMaster

val cat = new Cat
cat.speak
cat.comeToMaster

val dragon = new FlyingPet {
  override def comeToMaster: Unit = println("Rooarrr")
}
dragon.fly
dragon.comeToMaster
