package lectures

object Recursion extends App {

  def aFactorial(n: Int): Int = {
    if (n <= 0) 1
    else {
      println("")
      val result = n * aFactorial(n - 1)
    }
  }


}
