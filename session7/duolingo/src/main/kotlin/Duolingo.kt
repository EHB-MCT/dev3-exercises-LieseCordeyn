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
     val chosenWords = words.take(5)
     chosenWords.forEach{
         println("vertaal " + it.original + " in het Nederlands ")
     }


 }
}

