fun main(){
    println("Welke taal wil je leren? Kies uit Frans of Engels")
    val language = readLine()!!.toString()
    val duo = Duolingo( language)
}