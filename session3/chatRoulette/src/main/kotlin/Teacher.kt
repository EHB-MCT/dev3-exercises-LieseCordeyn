class Teacher(override val name:String): Person(name){
    override fun talk(){
        funfact()
    }
    fun funfact(){
        println("A cat has 32 muscles in it's ear")
    }
}