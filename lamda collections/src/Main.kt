fun main() { //Is it a common practice to write all functions outside main function?
    // and anything else (val,lists,..etc) inside main?
    val numbersList = listOf(1,2,3,4,5,6,7,8,9,10)
    val doubledNumbers = numbersList.map { it * 2 }
    println(doubledNumbers)
//
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    fun filterNames(names: List<String>, logic: (List<String>) -> List<String>): List<String> {
        return logic(names)
    }
    val logic: (List<String>) -> List<String> = { namesList -> namesList.filter { it.startsWith("A") }}
    println(filterNames(names, logic)) //Q? Can i do this in a simpler way? the question is stupidly written
//
    val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sorting = {list: List<String> -> list.sortedByDescending { it.length }} //Q! this one is used for any list?
    //val sorting = words.sortedByDescending { it.length } // while this one is used for this specific list?
    println(sorting(words))
//
    fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter) }

    // Instead of writing in-line Lambdas in the 2nd parameter, I can write full lambda funcions
    // that I can use later on:
    // val greaterThanFive: (Int) -> Boolean = { it > 5 }
    //val evenNumbers: (Int) -> Boolean = { it % 2 == 0 }
    // val multiplesOfThree: (Int) -> Boolean = { it % 3 == 0 }

    println(customFilter(numbersList) { it > 5 })
    println(customFilter(numbersList) { it % 2 == 0 })
    println(customFilter(numbersList) { it % 3 == 0 })

//
    fun processNumbers(numbers: List<Int>): List<Int> {
    val filterEven = { number: Int -> number % 2 !=0 }
    val square = { number: Int -> number * number }
    return numbers.filter(filterEven).map(square) }

    println(processNumbers(numbersList))
// BONUS
    fun processNumbers2(numbers: List<Int>, filter: (Int) -> Boolean, square: (Int) -> Int): List<Int> {
    return numbers.filter(filter).map(square)
}
    println(processNumbers2(numbersList, { it % 2 != 0}, { it * it }))
}