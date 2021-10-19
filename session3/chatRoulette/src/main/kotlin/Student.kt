class Student(override val name:String): Person(name){
   fun gossip(){
        println("omg, you'll never guess what I just heard")
    }
}