// You want to create a Singleton object
// to ensure that only one instance of a class exists

object CashRegister {
  def open { println("opened")}
  def close { println("close")}
}

// cash register defined as an object
// => can only be one instance of it

object Main extends App {
  CashRegister.open
  CashRegister.close
}