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
        println("Too bad, you fell asleep again")
        gameOver()
    }
}

fun challengeTwo(){
    println("You decide to drink coffee to wake up, how many caffeine will you add in your coffee?")
    println("low(1-3) or high(4-6) ps: choose wisely ;) pps: this is pure luck, have fun guessing the right thing")
    val computerInput = (0..6).random()
    val userInput = readLine()


    if (computerInput <= 3) {
        if (userInput == "high") {
            println("Too bad, you added too much caffeine and became to hyper for school")
            gameOver()
        } else if (userInput == "low"){
            println("Aahn you choose the right amount and woke up")
            challengeThree()
        }
    } else if (computerInput >= 4){
        if (userInput == "high"){
            println("Aahn you choose the right amount and woke up")
            challengeThree()
        } else if (userInput == "low"){
            println("Too bad, you didn't add enough and fell asleep again")
            gameOver()
        }
    }

}

fun challengeThree(){

}

fun gameOver(){
    println("ready to try again?")
    challengeOne()
}