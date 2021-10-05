fun main(){
    var options = arrayOf("rock", "paper", "scissors");

    var optionComputer = "rock"

    var userInput = readLine()

    /* if (optionComputer == "rock"){
        if (userInput == "rock"){
            println("draw")
        } else if (userInput == "paper"){
            println("you win")
        } else if (userInput == "scissors"){
            println("you lose")
        }
    } */

    if (userInput == "paper"){
        when (optionComputer){
            "paper" -> println("draw")
            "scissors" -> println("you lose")
            "rock" -> println("you win")
        }
    }
    if (userInput == "scissors"){
        when (optionComputer){
            "paper" -> println("you win")
            "scissors" -> println("draw")
            "rock" -> println("you lose")
        }
    }

    if (userInput == "rock"){
        when (optionComputer){
            "paper" -> println("you lose")
            "scissors" -> println("you win")
            "rock" -> println("draw")
        }
    }

    println( "Computer chose $optionComputer");

}