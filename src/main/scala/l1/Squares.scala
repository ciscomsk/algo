package l1

object Squares extends App {

  def spell(predicate: Boolean): Unit =
    if (predicate) print("#") else print(".")

  def castSpell(): Unit = {
    for (x <- 0 to 24) {
      for (y <- 0 to 24) {
        spell(x == y)
      }
      println
    }
  }

  castSpell()


}
