class Duolingo(rounds: Int, taal: String) {
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
    var randomWords =  words.shuffled().filter { it.language == taal }.take(rounds).toMutableList()
        play(randomWords)
    }

    fun play(chosenWords:MutableList<Word>) {

        while (chosenWords.count() > 0) {
            val currentWord = chosenWords.random()
            println("vertaal " + currentWord.original + " in het Nederlands")
            val userInput = readLine()
            if (userInput == currentWord.translated) {
                println("Correct!")
                chosenWords.remove(currentWord)
            } else {
                println("Helaas, " + currentWord.translated + " is het juiste antwoord, probeer straks eens opnieuw ")
            }

            when {
                chosenWords.count() == 0 -> println("Gefeliciteerd!")
                chosenWords.count() > 0 -> println("Nog " + chosenWords.count() + " woorden te vertalen")
            }

        }

        println("Je hebt alle woorden vertaald! Type opnieuw om nog eens te spelen.")
        val userInput2 = readLine()
        if (userInput2 == "opnieuw") {
            play(chosenWords)
        } else {
            println("Goodbye!")
        }

    }
}


