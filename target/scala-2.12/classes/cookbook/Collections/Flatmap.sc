// use flatmap where you run map followed by flatten

val bag = List("1", "2", "three", "4", "one hundred seventy five")

def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: Exception => None
  }
}

bag.flatMap(toInt).sum

bag.map(toInt).flatten.sum // flatmap

// think map flat

// easy to call more methods

bag.flatMap(toInt).filter(_ > 1)