val lambdaSortDescending = {a:List<String> -> a.sortedByDescending {it}}

fun main(){
    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    println(lambdaSortDescending(fruits))

}
