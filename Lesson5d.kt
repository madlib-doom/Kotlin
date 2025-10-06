// inheritance :Is the aspect whereby a subclass normally inherit from a superclass

open class Animal{
    fun eat(){
        println("This anmal can eat.")
    }
    fun run(){
        println("This animal can run.")
    }
}
class Dog:Animal(){
    fun bark(){
        println("This dog can Bark..")
    }
}

fun main(){
    var myDog=Dog()

    myDog.bark()
    myDog.eat()
    myDog.run()
}