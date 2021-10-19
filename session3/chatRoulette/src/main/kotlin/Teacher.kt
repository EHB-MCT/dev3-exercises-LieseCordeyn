class Teacher(override val name:String): Person(name), ChatPartner{
    override fun talk(){
        funfact()
    }
    fun funfact(){
        println("A cat has 32 muscles in it's ear")
    }
}