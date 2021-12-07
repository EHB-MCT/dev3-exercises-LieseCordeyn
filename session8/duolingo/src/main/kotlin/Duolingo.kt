import kotlin.math.round

class Duolingo( taal: String) {
    val words = mutableListOf<Word>(
        EnglishWord("cat", "kat"),
        FrenchWord("chat", "kat"),
        EnglishWord("dog", "hond"),
        FrenchWord("chien", "hond"),
        EnglishWord("bunny", "konijn"),
        FrenchWord("lapin", "konijn"),
        EnglishWord("fish", "vis"),
        FrenchWord("poisson", "vis"),
        EnglishWord("horse", "paard"),
        FrenchWord("cheval", "paard"),
        EnglishWord("goat", "geit"),
        FrenchWord("chevre", "geit"),
        EnglishWord("chicken", "kip"),
        FrenchWord("poulet", "kip"),
        EnglishWord("mouse", "muis"),
        FrenchWord("souris", "muis"),
        EnglishWord("donkey", "ezel"),
        FrenchWord("ane", "ezel"),
        EnglishWord("snake", "slang"),
        FrenchWord("serpent", "slang")
    )
    init {
        println("Kies je moeilijkheidsgraad (makkelijk - moeilijk)")
        val roundsWord = readLine()!!
        var rounds = 0
        if (roundsWord == "makkelijk"){
            rounds = 5
        } else if (roundsWord == "moeilijk"){
            rounds = 10}
        else {
            throw Exception("moeilijkheidsgraad niet gevonden")
            Duolingo(taal)
        }
    var randomWords =  words.shuffled().filter { it.language == taal }.take(rounds).toMutableList()
        play(randomWords)
    }

    fun play(chosenWords:MutableList<Word>) {

        while (chosenWords.count() > 0) {
            val currentWord = chosenWords.random()
            println("vertaal " + currentWord.original + " in het Nederlands")
            val userInput = readLine()
            if (userInput == currentWord.translated) {
               currentWord.difficulty = currentWord.difficulty - 1
                println("Correct!")
                chosenWords.remove(currentWord)
            } else {
                currentWord.difficulty = currentWord.difficulty + 2
                println("Helaas, " + currentWord.translated + " is het juiste antwoord, probeer straks eens opnieuw ")
            }

            println("moeilijkheidsgraad woord = ${currentWord.difficulty}")

            when {
                chosenWords.count() == 0 -> println("Gefeliciteerd!")
                chosenWords.count() > 0 -> println("Nog " + chosenWords.count() + " woorden te vertalen")
            }

        }

        println("Je hebt alle woorden vertaald! Type opnieuw om nog eens te spelen.")
        val userInput2 = readLine()
        if (userInput2 == "opnieuw") {
            main()
        } else {
            println("Goodbye!")
        }

    }
}


