package lectures

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x)) // Logical negation
  //! && ||

  var aVariable = 2
  aVariable += 3 // -= *= /=

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue) // EXPRESSION


  // NEVER DO THIS
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is a EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigns

  // Codeblocks

  val aCodeblock = { // IS A EXPRESSION
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye" // TYPE OF LAST EXPRESSION
  }

  // 1. Difference between "hello world" vs println("hello world")
  //                          STRING        SIDE EFFECT (UNIT)
  
}
