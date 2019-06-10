val x = List(15, 10, 5, 8, 20, 12)

val y = x.groupBy(_ > 10) // map: false -> list, true -> list

val y1 = x.partition(_ > 10)
// list of lists: List[>10], List[=< 10]

val y2 = x.span(_ < 20) // until predicate true, splits list

val y3 = x.splitAt(2) // split at element

val (a, b) = x.partition(_ > 10) // assigns partition, tuple

val groups = x.groupBy(_ > 10)
val trues = groups(true)
val falses = groups(false)

