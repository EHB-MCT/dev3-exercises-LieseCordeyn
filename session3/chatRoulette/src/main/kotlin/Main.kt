fun main(){
   val persons = arrayOf<Person>(Student("britt"), Teacher("Bert"), Comedian("Mike"))

    val randomPerson = persons.random()
    randomPerson.introduce()
    randomPerson.talk()
  /*  when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
        is Chatbot -> randomPerson.chat()
    } */

    }
