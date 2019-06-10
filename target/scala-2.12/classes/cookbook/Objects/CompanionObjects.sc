// you want to create a class that has instance methods and static methods

// pizza class
class Pizza (var crustType: String) {
  override def toString = "Crust type is " + crustType
}

// companion object
object Pizza {
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"
  def getFoo = "foo"
}

println(Pizza.CRUST_TYPE_THIN)
println(Pizza.getFoo)
val p = new Pizza("thin")