fun main() {

    val fruits = arrayListOf( "apple", "banana", "kiwi", "strawberry", "grape")
//    val fruitsLength= fruits.map { fruit -> fruit.length }

   val sortedList =fruits.sortedByDescending{it.length}
    println(sortedList)



}
