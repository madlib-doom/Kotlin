fun main(){
    val points=-6
    if( points>0 && points<=100){
        println("Congrats you stand a chance to win a phone")

    }
    else if(points>100 && points<=300){
        println("Congrats you stand a chance to win a laptop")
    }
    else if(points>300 && points<=1000){
        println("Congrats you stand a chance to win a new car")
    }
    else if(points>1000){
        println("Congrats you have won a free trip around the globe")
    }
    else{
        println("Enter correct amount to continue")
    }
    
    
}