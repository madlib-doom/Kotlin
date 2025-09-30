fun main(){
    val result=99
    if(result<=30){
        println("Very poor result.Come with your parent")

    }
    else if(result>30 && result<=40){
        println("Poor.You can do better")
    }
    else if(result>40 && result<=50){
        println("Below average")
    }
    else if(result>50 && result<=60){
        println("Average aim higher")
    }
    else if(result>60 && result<=80){
        println("Good.You can do better than this ")
    }
    else if(result>80 && result<=100){
        println("Excellent work")
    }
    else{
        println("Error marks cannot be found ")
    }
}