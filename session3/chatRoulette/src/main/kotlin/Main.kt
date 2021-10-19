fun main(){
   val persons = arrayOf(Student("britt"), Teacher("Bert"), Comedian("Mike"), Chatbot("sheep"))
    val randomPerson = persons.random()
    randomPerson.introduce()
    randomPerson.talk()


  /* EIGEN CODE
  when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
        is Chatbot -> randomPerson.chat()
    } */

    }
