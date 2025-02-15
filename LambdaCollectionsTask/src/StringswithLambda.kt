fun main() {
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    fun filterNames(names: List<String>, condition: (String) -> Boolean): List<String> {
        return names.filter(condition)
    }

    val filteredNames = filterNames(names) { it.startsWith("A") }

    println(filteredNames)
}