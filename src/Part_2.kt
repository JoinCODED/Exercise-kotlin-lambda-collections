//filtering the letter J instead of A   
fun main(){
    val namesList = listOf("Johnathan", "Dio", "Joseph", "Giorno", "Josuke", "Diego")

    println(filterNames(namesList,lambdaFuncThatTakesListAndReturnsFilteredList))

}

fun filterNames(listName:List<String>,  lambdaFunction:(List<String>)->List<String>):  List<String> {

    return lambdaFunction(listName)
}


var lambdaFuncThatTakesListAndReturnsFilteredList: (List<String>) -> List<String> =
                                        {names:List<String> -> names.filter {it.contains("J")}}

//I was getting annoyed at how lambda functions work. So, naming reminds me how they work