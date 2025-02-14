fun filterNames(names: List<String>, filter: (String) -> Boolean): List<String> {
    return names.filter { filter(it) }
}

fun main() {
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filteredNames = filterNames(names) { it.startsWith("A") }
    println(filteredNames)
}
