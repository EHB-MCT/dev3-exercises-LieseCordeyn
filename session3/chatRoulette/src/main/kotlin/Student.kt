class Student(override val name:String): Person(name), ChatPartner{
    override fun talk(){
        gossip()
    }
   fun gossip(){
        println("omg, you'll never guess what I just heard")
    }
}