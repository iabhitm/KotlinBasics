//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Please enter your age:")
    val age = readLine()?.toInt()
    if (age != null) {
        if (age in 0..17) {
            println("You are not yet adult")
        } else if (age in 18..65) {
            println("your are an adult")
        } else {
            println("your are tooooooo old :(")
        }
    }
}

