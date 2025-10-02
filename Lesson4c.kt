fun main() {
    // Parameters are avlues that get passed as arguments when we invoke a function
 greetings("Joan")
 greetings("James")

 simpleInterest(rate=7,time=8,principle=50000.00)
}
fun greetings(name:String){
 println("Hello "+name+".How have you been?Hope all is fine ")
}

fun simpleInterest(rate:Int,time:Int,principle:Double){
    val si:Double=(rate*time*principle)/100

    println("The simple interest gained is $"+si+".")
}