
val listOfWords = listOf("Apple","Banana","Kiwi", "Strawberry", "Grape")
val sortedList: (List<String>) -> List<String> = { it.sortedByDescending { it.length }}

fun main() {
println(sortedList(listOfWords))
}