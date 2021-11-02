class SquareElement {

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y * y :: squareList(ys)
    }

  def squareList1(xs: List[Int]): List[Int] =
    xs map (x => x * x)

}