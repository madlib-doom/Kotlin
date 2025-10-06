 open class Diplopoda {
fun crawl(){
    println("This animal can crawl")
}

 open fun eat(){
    println("This animal eats leaves")
}
}

class Millipede:Diplopoda(){

    fun limbs(){
        println("Millipedes have almost 100 pairs of legs")
    }

    override fun eat(){
        println("The animal bites")
    }
}

fun main(){

     var myassignment=Millipede()

     myassignment.limbs()
     myassignment.eat()
     
}