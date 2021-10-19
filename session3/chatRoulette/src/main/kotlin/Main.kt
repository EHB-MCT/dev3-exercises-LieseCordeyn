fun main(){
    val liese = Student("Liese")
    val britt = Student("britt")
    val bert = Teacher("Bert")
    val mike = Teacher ("Mike")
    val joey = Comedian("joey")
    val sheep = Chatbot("sheep")

    val persons = listOf(britt, liese, bert, mike, joey, sheep)

    var randomPerson = persons.random()
    randomPerson.introduce()
    when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
        is Chatbot -> randomPerson.chat()
    }

    randomPerson = persons.random()
    randomPerson.introduce()
    when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
        is Chatbot -> randomPerson.chat()
    }



 }