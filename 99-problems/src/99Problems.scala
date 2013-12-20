/**
 * Solutions to problems in http://aperiodic.net/phil/scala/s-99/. You can just drop these straight into the Scala
 * REPL.
 *
 * @author ross
 */

object P01{
  def last(x: List[Int]): Int = { if(x.tail.isEmpty) x.head else last(x.tail) }
  last(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 8
}

object P02{
  def penultimate(x: List[Int]): Int = { if(x.tail.tail.isEmpty) x.head else penultimate(x.tail) }
  penultimate(List(1, 1, 2, 3, 5, 8))
  // res0: Int = 5
}