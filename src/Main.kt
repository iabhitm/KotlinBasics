fun main(){
    println("enter a number1")
    val number1 = readLine()!!.toInt()
    println("enter a number2")
    val number2 = readLine()!!.toInt()
    println("enter operation")
    val operation = readLine()!!
    if(operation == "+"){
        println("Result: ${number1 + number2}")
    }
    if(operation == "-"){
        println("Result: ${number1 - number2}")
    }
    if(operation == "*"){
        println("Result: ${number1 * number2}")
    }
    if(operation == "/") {
        println("Result: ${number1 / number2}")
    }
    if(operation == "%") {
        println("Result: ${number1 % number2}")
    }
}