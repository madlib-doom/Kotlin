fun main() {

    speed()
    area()
   
}
fun speed(){
    val d=120
    val time=2.5

    val speed=d/time
    val ms=speed*5/18

    println("The speed is: $ms")
 
}
fun area(){
    val radius=7
    val height=10

    val area:Double=2*3.142*radius*(radius+height)
    // val surface=area*radius

    println("The area is: $area")
      
}