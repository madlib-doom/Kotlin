fun main() {
    val weight= 68
    val height=1.70

    val BMI=weight/(height*height)

    if (BMI<18.5){
        println("You are underweight: ($BMI)")
    }
    else if(BMI>18.5 && BMI<=24.9){
        println("You have a normal BMI: ($BMI)")

    }
    else if(BMI>24.9 && BMI<=29.9){
        println("You are overweight: ($BMI)")
    }
    else if(BMI>30.0){
        println("You are obese: ($BMI)")
    }
    

}