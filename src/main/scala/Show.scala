trait Show[A] {
  def show(a: A): String
}
object Typeclass  {
  implicit val intShow = new Show[Int] {
    def show(i: Int) = i.toString
  }

  implicit val longShow = new Show[Long] {
    def show(i: Long) = i.toString
  }

  implicit val doubleShow = new Show[Double] {
    def show(i: Double) = i.toString
  }
  case class Position(x: Int, y: Int)

  implicit val positionShow = new Show[Position] {
    def show(i: Position) = s"Pos(x: ${i.x}, y: ${i.y})"
  }
}