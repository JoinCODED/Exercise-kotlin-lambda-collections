fun main() {
    //Part 1
    val listOfIntegers = (1..10).toList()
    println(listOfIntegers.map { it * 2})

    //Part 2
    val namesList = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    println(filterNames(namesList) { it.startsWith('A') })

    //Part 3
    val wordsList = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    println(wordsList.sortedByDescending { it.length })

    //Part 4
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })

    //Part 5
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(processNumbers(listOfNumbers, { it % 2 != 0 }) { it * it })
}


//Part 2
fun filterNames(listOfNames: List<String>, filterLogic: (String) -> Boolean): List<String> {
    return listOfNames.filter(filterLogic)
}

//Part 4
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

//Part 5
fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, square: (Int) -> Int): List<Int> {
    return numbers.filter(filter).map(square)
}