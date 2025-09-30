fun main() {
    val points=10001

    when(points){
        in 0..100 -> println("Congrtas you stand a chance to win a new phone")
        in 101..300 -> println("Congrtas you stand a chance to win a new laptop")
        in 301..1000 -> println("Congrtas you stand a chance to win a new car")
        in 1001..100000 ->println("Congrtas you win a free trip around the globe")
        else -> println("Enter a valid amount to play")
    }
    
}