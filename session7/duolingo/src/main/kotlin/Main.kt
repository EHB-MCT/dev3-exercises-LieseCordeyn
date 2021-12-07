fun main(){

    println("Hoeveel woorden wil je vertalen (max 10)")
    val rounds = readLine()!!.toInt()
    println("Welke taal wil je leren? Kies uit Frans of Engels")
    val language = readLine()!!.toString()
    val duo = Duolingo(rounds, language)
}