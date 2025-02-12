fun main() {
    val wordsList = listOf("apple", "banana", "kiwi", "strawberry", "grape");
    val sortedWordsList = wordsList.sortedByDescending { it.length };

    println(sortedWordsList);
}