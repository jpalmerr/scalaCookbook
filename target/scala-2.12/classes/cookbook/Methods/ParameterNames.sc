// update parameters

class Pizza {
  var crustSize = 12 // var just for demonstration
  var crustType = "thin"

  def update(crustSize: Int, crustType: String): Unit = {
    this.crustSize = crustSize
    this.crustType = crustType
  }

  override def toString: String = {
    "A %d inch %s crust pizza".format(crustSize, crustType)
  }
}

val p = new Pizza

p.update(crustSize = 16, crustType = "thick")
p.toString
p.update(crustType = "Pan", crustSize = 14)
p.toString