fun main(){
    var names = arrayOf("Liese", "Britt", "Rebecca", "Arno", "Hannelore")
    for (name in names){
       printName(name)
    }
}

fun printName(x:String){
    println("hello $x")
}
