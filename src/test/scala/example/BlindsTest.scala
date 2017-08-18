package example

import org.scalatest.FunSuite
import eu.timepit.refined.auto._

class BlindsTest extends FunSuite {
  test("blinds") {
    Blinds.createLiteral(5L)(10L)
  }
}
