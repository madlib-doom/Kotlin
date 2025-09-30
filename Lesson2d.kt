 fun main() {
    val mark=101

    when (mark){
        in 1..30->println("Below average")
        in 31..50 -> println("You have average")
        in 51..70 -> println("Ypu have above average")
        in 71..100 -> println("Excellent")
        else -> println("Invalid scores")
    }
}