class Chatbot(override val name:String): Person(name) {
    fun chat(){
        println("beep beep I'm a sheep")
    }
}