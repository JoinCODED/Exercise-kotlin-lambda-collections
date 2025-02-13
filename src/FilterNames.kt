fun main(){

    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    val filteredNamess = filterNames(names){it.startsWith("A")}

    println(filteredNamess)

}

fun filterNames(names: List<String>, filterLogic: (String) -> Boolean): List<String>{
    return names.filter(filterLogic)
}