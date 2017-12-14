package example

import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.Greater
import shapeless.Witness
import shapeless.tag.@@

case class Blinds private (small: Long, big: Long)

object Blinds {

  def createLiteral[L <: Long](sb: L)(bb: Long @@ Greater[sb.type]): Blinds =
    new Blinds(sb, bb)

  val literals = createLiteral(5L)(10L)
  println(literals)
}
