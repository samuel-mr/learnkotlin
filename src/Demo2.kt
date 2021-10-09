fun main(args : Array<String>){
    println("Inicial ejecución")
    val person =  Person("Bach")

    person.Name = "Sebastian"
    person.Display()
    person.DisplayWithLambda(::methodAsReference)
}

fun methodAsReference(name : String){
    println("($name) Metodo General")
}

 class Person ( var Name : String ){

     fun Display(){
         println("Nombre: $Name")
     }

     fun DisplayWithLambda(funcion : (s:String) -> Unit){
         funcion("Metodo in Person: $Name")
     }
}