fun main (){
    val fruits = listOf ("apple","banana","kiwi","strawberry","grape")
    val sortedFruits = fruits.sortedByDescending {it.length}
    println(sortedFruits)
}