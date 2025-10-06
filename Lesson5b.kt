class Circle(){

    var radius=7
    var product=3.14*(radius*radius)
    var sum=2*3.14*radius

    fun area(){
        println("The area is: $product")
    }
    fun circumference(){
        println("The circumference is : $sum")
    }
}

fun main() {
    var tree=Circle()

    tree.area()
    tree.circumference()
}
