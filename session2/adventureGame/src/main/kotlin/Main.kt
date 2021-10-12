fun main(){
    println("Ready to start your day?")
    challengeOne()
}

fun challengeOne(){
    println("It's 7am, your alarm clock is making a terrible noise")
    println("How many times do you snooze?")

    val rightAnswers = setOf<String>("none", "one time", "two times", "three times")

    val userInput = readLine()

    if (rightAnswers.contains(userInput)){
        println("Yes!! You managed to wake up in time")
        challengeTwo()
    } else {
        gameOver()
    }
}

fun challengeTwo(){

}

fun gameOver(){
    println("Too bad, you fell asleep again")
    println("ready to try again?")
    challengeOne()
}