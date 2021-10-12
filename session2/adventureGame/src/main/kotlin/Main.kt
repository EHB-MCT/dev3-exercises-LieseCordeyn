
fun main(){
    println("Ready to start your day?")
    challengeFour()
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
    println("You're ready to go to school, how are you going to school?")
    println("You can choose between three options: on foot - with bike - with NMBS")
    val userInput = readLine()

    when(userInput){
        "on foot" ->{
            println("Oh no, you don't have enough energy, time to go back and drink some coffee muahaha")
            challengeTwo()
        }
        "with bike" ->{
            println("Good job! you chose the right thing and entered school in time")
            challengeFour()
        }
        "with NMBS" ->{
            println("seriously? You chose NMBS? Are you really that stupid? Ofcourse you are too late! You missed the whole day")
            println("Try again tomorrow and hopefully you make a better choice")
            gameOver()
        }
    }

}

val computerInput = (0..100).random()

fun challengeFour(){
    println("Your at school, time to decide how active you will be today")
    println("choose a number between 1 and 100")
    var userInput = Integer.valueOf(readLine())

    if(userInput == computerInput){
        println("aahn yes, you chose the right amount of energy")
        challengeFive()
    } else if (userInput < computerInput){
        println("Hmmm that's a really low energy-level, try picking a higher number")
        challengeFour()
    } else if (userInput > computerInput){
        println("Hmmm that's a bit too much don't you think? Try picking a lower number")
        challengeFour()
    }
}

fun challengeFive(){

}

fun gameOver(){
    println("ready to try again?")
    challengeOne()
}

// co-creation with Britt, ps we didn't steal code :)