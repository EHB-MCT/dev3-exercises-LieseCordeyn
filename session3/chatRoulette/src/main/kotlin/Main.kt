fun main(){
    val liese = Person("Liese")
    val britt = Person ("britt")

    val persons = arrayOf(britt, liese)

    persons.random().introduce()
}