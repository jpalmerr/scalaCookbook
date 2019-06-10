// you'd like to have access to a counter in the loop
// without having to manually create a counter

val days = Array("Sunday", "Monday", "Tuesday", "Wednesday",
                 "Thursday", "Friday", "Saturday")

days.zipWithIndex.foreach {
  case (day, count) => println(s"$count is $day")
}