import org.scalatest.funsuite.AnyFunSuite
import Typeclass._
class TypeClassSpec extends AnyFunSuite {
  test("Test for Integer") {
    val integerShow1 = intShow.show(56)
    assert(integerShow1 === "56")
  }

  test("Tet for Long") {
    val longShow1 = longShow.show(123456789102L)
    assert(longShow1 === "123456789102")
  }

  test("Test For Double") {
    val doubleShow1 = doubleShow.show(56.23)
    assert(doubleShow1 === "56.23")
  }

  test("Test for Position") {
    val position = new Position(0, 1)
    val position1 = positionShow.show(position)
    assert(position1 === "Pos(x: 0, y: 1)")
  }
}
