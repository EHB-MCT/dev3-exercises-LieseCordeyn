class Duolingo {
     val words = mutableListOf<Word>(Word("cat", "kat", "Engels"), Word("chat", "kat","Frans"),
                         Word("dog", "hond","Engels"),
                         Word("chien", "hond","Frans"),
                         Word("bunny", "konijn","Engels"),
                         Word("lapin", "konijn","Frans"),
                         Word("fish", "vis","Engels"),
                         Word("poisson", "vis","Frans"),
                         Word("horse", "paard","Engels"),
                         Word("cheval", "paard","Frans"),
                         Word("goat", "geit","Engels"),
                         Word("chevre", "geit","Frans"),
                         Word("chicken", "kip","Engels"),
                         Word("poulet", "kip","Frans"),
                         Word("mouse", "muis","Engels"),
                         Word("souris", "muis","Frans"),
                         Word("donkey", "ezel","Engels"),
                         Word("ane", "ezel","Frans"),
                         Word("snake", "slang","Engels"),
                         Word("serpent", "slang","Frans"),

     )

 fun play(){
     words.shuffle()
     val chosenWords = words.take(5).toMutableSet()

     while(chosenWords.count() > 0){
         val currentWord = chosenWords.random()
         println("vertaal " + currentWord.original + " in het Nederlands")
         val userInput = readLine()
             if (userInput == currentWord.translated){
                 println("Correct!")
                 chosenWords.remove(currentWord)
             } else {
                 println("Helaas, " + currentWord.translated + " is het juiste antwoord, probeer straks eens opnieuw ")
             }

         when{
             chosenWords.count()==0 -> println("Gefeliciteerd!")
             chosenWords.count()>0 ->  println("Nog " +chosenWords.count()+ " woorden te vertalen")
         }

     }

     println("Je hebt alle woorden vertaald! Type opnieuw om nog eens te spelen.")
     val userInput2 = readLine()
     if (userInput2 == "opnieuw"){
         play()
     } else {
         println("Goodbye!")
     }

     }



 }


