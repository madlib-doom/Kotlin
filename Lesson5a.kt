// OOP-object-oriented programming
// An object is a real world thing that contains properties/states and behaviuors/characterisics

// objects are normalyy instanciated from existingt classes. 

class Person{
    // attributes/properties/states of a person
    var name="James"
    var age=33
    var height=1.34

    // behaviours/actions/function

    fun speak(){
        println("A person $name can speak.")
    }
    fun run(){
        println("A person $age can run")
    }
}

fun main() {
    // For us to be able to access the state or the behaviuor of a 
    // person we require to have an object
    // Below we create the object

    var myobject=Person()

    // By use of object we can now access the diffrent states/behavious

    myobject.speak()
    myobject.run()
}