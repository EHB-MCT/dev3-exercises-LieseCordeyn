class Chatbot(val name: String): ChatPartner {
   override fun introduce(){
        println("Hi, my name is $name")
    }
    override fun talk(){
        println("beep beep, I'm a sheep")
    }
}