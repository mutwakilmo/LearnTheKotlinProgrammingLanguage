
fun main() {
}

/*fun generateAnswerString() : String{
    val answerString = if(count ==42){
        "I have the answer ."
    } else{
        "The answer eludes me"
    }
    return answerString*/

    /*************************************************/
    //Functions can take arguments as input, as shown in the following example:

  /*  fun generateAnswerString(countThreshold: Int): String {
        val answerString = if (count > countThreshold) {
            "I have the answer."
        } else {
            "The answer eludes me."
        }

        return answerString
    }*/

/***********************************************************************/
//Simplifying function declarations

/*fun generateAnswerString(countThreshold: Int): String {
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
}
*/
  /****************************************************************************/

//replace the return keyword with assignment operator
/*
fun generateAnswerString(countThreshold : Int): String =if (count > countThreshold){
      "I have the answer"
  } else{
      "The answer eludes me"
  }*/

/*****************************************************************************/
//Anonymous functions
/*
Like named functions, anonymous functions can contain any number of expressions.
 The returned value of the function is the result of the final expression.
 */

/*
val stringLengthFunc: (String) -> Int = {
    input -> input.length
}
*/
/*val stringLengthFunc: (String) -> Int = { input ->
    input.length
}*/
/*******************************************************/

//Here's an example of a higher-order function:

fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}




