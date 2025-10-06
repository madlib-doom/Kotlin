class Rectangle(){
    var len=50
    var height=25
    var area=len*height
    var per=(len*2)+(height*2)

    fun product(){
        println("The area is: $area")
    }
    fun perimeter(){
        println("The perimeter is: $per")
    }



    
}
                                                              
fun main() {
    var calc=Rectangle()


    calc.product()
    calc.perimeter()
}