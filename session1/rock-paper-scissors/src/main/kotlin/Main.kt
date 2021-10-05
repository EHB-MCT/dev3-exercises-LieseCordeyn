fun main(){
    var options = arrayOf("rock", "paper", "scissors");

    var optionComputer = "rock"

    var userInput = readLine()

    if (optionComputer == "rock"){
        if (userInput == "rock"){
            println("draw")
        } else if (userInput == "paper"){
            println("you win")
        } else if (userInput == "scissors"){
            println("you lose")
        }
    }

}