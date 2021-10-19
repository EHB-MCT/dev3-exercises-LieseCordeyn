fun main(){
    val liese = Student("Liese")
    val britt = Student("britt")
    val bert = Teacher("Bert")
    val mike = Teacher ("Mike")
    val joey = Comedian("joey")

    val persons = arrayOf(britt, liese, bert, mike, joey)

    val randomPerson = persons.random()
    randomPerson.introduce()
    when(randomPerson) {
        is Student -> randomPerson.gossip()
        is Teacher -> randomPerson.funfact()
        is Comedian -> randomPerson.joke()
    }

}