val xs = Seq(4, 5, 2, -1, -3, 4)

/* partition

partition allows to split a collection into two collections based on a given predicate
 */

val even = xs.filter(_ % 2 == 0)
val odd = xs.filterNot(_ % 2 == 0)

val (evens, odds) = xs.partition(_ % 2 == 0)

/* minBy / maxBy

get the number that has the smallest absolute value
 */

val minByAbs = xs.minBy(Math.abs)

/* collect / collectFirst

filter the collection and perform some mapping
 */

val doublesOfPositive = xs.collect {
  case x if x > 0 =>
    2 * x
}

val safeDoublesOfPositive: Option[Int] = xs.collectFirst{
  case x if x > 0 =>
    2 * x
}

val noPosSeq = Seq(-1, -2, -3)
val doublesOfPos = noPosSeq.collectFirst{
  case x if x > 0 =>
    2 * x
} // None

/* split at

splitAt is a nice way to split a collection into two contiguous parts on the given index
 */

val (leftHalf, rightHalf) = xs.splitAt(3)

/* grouped

grouped(n) splits the collection into collections with n elements each
 */

xs.grouped(3).toList
xs.grouped(4).toList

/* count

count the number of elements in a collection that are matching some predicate
 */

val evenCount = xs.count(_ % 2 == 0)

/* exists

Need to check for the existence of some element that matches the given predicate?
 */

xs.exists(_ % 42 == 0)

/* last

no need for reverse.head
 */

xs.last

// indexOfSlice / lastIndexOfSlice

val string = "a" * 2000000
val substring = "a" * 1000000 + "b"

string.indexOfSlice(substring)
