fun filterNames (names: List<String>,
                 condition: (String) -> Boolean): List<String> {
    return names.filter(condition)
}
fun main(){
    val names = listOf("Alice", "Bob", "Amir",
        "Charlie", "Annie", "David")
    val filterName = filterNames(names)
    { it.startsWith("A")}
    println(filterName)
}