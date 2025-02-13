fun main(){
    val fruitNames = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sortedFruits = fruitNames.sortedByDescending {it -> it.length}
    println(sortedFruits)
}
