fun main() {
    val numList = (1..10).toList()
    val doubleList = numList.map { it * 2 }
    println(doubleList)


    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filteredNames = filterNames(names) { it.startsWith( 'A') }
    println(filteredNames)


    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sortedbylength = fruits.sortedByDescending { it.length }
    println(sortedbylength)

    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })
    println( customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })
    println( customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })



    val newList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // Step 1: Create a list of numbers

    val sequreNum = processNumbers(newList, { it % 2 != 0 }, { it * it }
    )

    println(sequreNum)
}

fun filterNames(names: List<String>, checked: (String) -> Boolean): List<String> {
    return names.filter(checked)
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

fun processNumbers(
    list: List<Int>,
    notEvent: (Int) -> Boolean,
    square: (Int) -> Int):
        List<Int> {
    return list.filter(notEvent).map(square)
}
