// you want to design a solution where multiple traits can
// be mixed into a class to provide a robust design

// to implement a simple mixin, define the methods you want in your trait
// then add the trait to your class using extends or with

trait Tail {
  def wagTail { println("tail is wagging")}
  def stopTail { println("tail is stopped")}
}

abstract class Pet (var name: String) {
  def speak // abstract
  def ownerIsHome { println("excited")}
  def jumpForJoy { println("jumping for joy")}
}

class Dog (name: String) extends Pet (name) with Tail {
  def speak {println("woof")}

  override def ownerIsHome: Unit = {
    wagTail
    speak
  }
}

val zeus = new Dog("Zeus")
zeus.ownerIsHome
zeus.jumpForJoy

// can use methods defined by both Pet and Tail