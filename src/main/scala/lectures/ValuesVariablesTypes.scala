package lectures

object ValuesVariablesTypes extends App {

  val x: Int = 42
  val y = 40 // COMPILER CAN INFER TYPES
  println(x)

  //  x = 2 VALUES ARE IMMUTABLE

  val aString: String = "hello"
  val aBool: Boolean = true
  val aChar: Char = 'a'
  val aInt: Int = 1
  val aShort: Short = 1234 // 4 BITES ONLY
  val aLong: Long = 12345678L // 8 BITES -> put L in the end
  val aFloat: Float = 2.0f // Without f is a double
  val aDouble: Double = 3.14

  // Variables
  var aVariables: Int = 5

  aVariables = 6 // Side effects
  aVariables += 1

  println(aVariables)
}
