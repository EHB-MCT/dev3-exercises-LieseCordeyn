open class Word(open val original: String, open val translated: String, val language: String,
                val startDifficulty: Int) {
    var difficulty: Int = startDifficulty
        set(value) {
            if (value == 0){
                field = 1
            } else {
                field = value
            }
        }

}