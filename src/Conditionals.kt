var count: Int = 42
fun main() {

    /*if (count == 42){
        println("I have the answer.")
    } else{
        println("The answer eludes me :)")
    }
    */
    // You can represent multiple conditions using else if

    /*if (count == 42) {
        println("I have the answer.")
    } else if (count > 35) {
        println("The answer is close.")
    } else {
        println("The answer eludes me")
    }*/
    /**************************************************************/

   /* val aswerString: String = if (count == 42) {
        "I have the answer"
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me"
    }
    println(aswerString)*/

    /**************************************************************/
    // when

    val answerString = when{
        count ==42 ->"I have the answer."
        count >35 -> "The answer is close."
        else ->"The answer eludes me"
    }
    println(answerString)

    /****************************************************************/

    val languageName :String ? = null
    if (languageName != null) {
        println(languageName.toUpperCase())
    }
}