fun main() {
    val fruits = listOf("apple", "banana",
        "kiwi", "strawberry", "grape")
    val wordLength = fruits.sortedByDescending { it.length }
    println(wordLength)
}
