package lectures

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunc(): Int = 42
  println(aParameterlessFunc())
  //  println(aParameterlessFunc)

  def aRepeatedFunction(aString: String, n:Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))
  // IN SCALA WE USE RECURSION INSTEAD OF LOOPS

  def aFuncWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunc(n: Int): Int = {
    def aSmallerFunc(a: Int, b: Int): Int = a + b

    aSmallerFunc(n, n-1)
  }

  /*
  1. A greeting func (name, age) => "Hi ____, ____"
  2. Factorial function 1 * 2 * 3 * ... * n
  3. A Fibbonacci -> f(n)
  4. Tests if a number is prime
  */

  def aGreetings(name: String, age: Int): String = "Hi " + name + ", I'm " + age
  println(aGreetings("Eric", 10))

  def aFactorial(n: Int): Int = {
    // n * i -> i = 1, 2, 3, 4, ..., n
    if (n <= 0) 1
    else n * aFactorial(n - 1)
  }
  println(aFactorial(5))

  def aFibbonacci(n: Int): Int = {
    if (n <= 2) 1
    else aFibbonacci(n - 1) + aFibbonacci(n - 2)
    // 1 1 2 3 5 8 13
  }
  println(aFibbonacci(6))

  def isPrime(n: Int): Boolean = {
    // if 13%2 -> 1 true
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else (n % t != 0 && isPrimeUntil(t - 1))
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(23391799))

}
