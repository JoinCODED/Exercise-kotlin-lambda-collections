fun main() {

    val names = arrayOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    val filteredNames = names.filter { name ->name.contains("A") }

    println(filteredNames)


}