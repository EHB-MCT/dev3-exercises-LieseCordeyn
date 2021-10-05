fun main(){
    val options = arrayOf("rock", "paper", "scissors");

    val optionComputer = "rock"
    println("choose your option: rock - paper - scissors")
    val userInput = readLine()

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
    }else if (userInput == "scissors"){
        when (optionComputer){
            "paper" -> println("you win")
            "scissors" -> println("draw")
            "rock" -> println("you lose")
        }
    }else if (userInput == "rock"){
        when (optionComputer){
            "paper" -> println("you lose")
            "scissors" -> println("you win")
            "rock" -> println("draw")
        }
    } else {
        println("invalid option")
    }

    println( "Computer chose $optionComputer");

}