// CONTROLLING WHICH TRAIT YOU CALL A METHOD FROM

trait Human {
  def hello = "Human"
}

trait Mother extends Human {
  override def hello = "Mother"
}

trait Father extends Human {
  override def hello = "Father"
}

class Child extends Human with Mother with Father {
  def printSuper = super.hello
  def printMother = super[Mother].hello
  def printFather = super[Father].hello
  def printHuman = super[Human].hello
}

val c1 = new Child
c1.hello // father ... since last
c1.printSuper // Father
c1.printMother
c1.printFather
c1.printHuman