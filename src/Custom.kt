fun main(){

    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")

    val sortedWords = fruits.sortedByDescending { it.length }

    println(sortedWords)
}