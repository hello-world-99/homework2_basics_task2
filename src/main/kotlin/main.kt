fun main() {
    while (true) {
        val likes = readln()
        val result: String =
            if(likes.last()=='1'&&(if(likes.length>1) likes[likes.length-2]!='1' else true)) "Понравилось $likes человеку" else "Понравилось $likes людям"
        println(result)
    }
}