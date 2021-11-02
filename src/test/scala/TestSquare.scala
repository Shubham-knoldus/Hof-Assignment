import org.scalatest.funsuite.AnyFunSuite
class TestSquare extends AnyFunSuite {

  val squreTest = new SquareElement
  val myList = List(2,3,4,5,6)

  test("Square the elements ") {
    assert(squreTest.squareList(myList) == List(4,9,16,25,36))
  }

  test("test the empty list") {
    assert(squreTest.squareList(List()) == List())
  }

  test("Squre the element by map") {
    assert(squreTest.squareList1(myList) == List(4,9,16,25,36))
  }

  test("test the empty list by map") {
    assert(squreTest.squareList1(List()) == List())
  }
}
