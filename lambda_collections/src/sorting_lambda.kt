fun main() {
    val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)
}
