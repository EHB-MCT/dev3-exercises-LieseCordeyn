class Comedian(override val name:String): Person(name), ChatPartner {
    override fun talk(){
        joke()
    }
    fun joke(){
        println("*insert funny joke*")
    }
}