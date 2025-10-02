import kotlin.math.*
fun main() {

    val principle=5000
    val rate=0.06
    val time=5 

 val amount=principle*(1+rate)*time.pow(5)
 val ci=amount-principle

 println("The compound ineterst is:$ci")


    
}