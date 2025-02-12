fun main() {
    // Part 1
    val numberList = (1..10).toList()
    val doubled = numberList.map {it * 2}
    println(doubled)

    // Part 2
    val people = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filteredPeople = filterNames(people) {it.startsWith("A")}
    println(filteredPeople)

    // Part 3
    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sortedFruits = fruits.sortedByDescending { it.length }
    println(sortedFruits)

    // Part 4
    println(customFilter(numberList) { it > 5 })
    println(customFilter(numberList) { it % 2 == 0 })
    println(customFilter(numberList) { it % 3 == 0 })

    // Part 5 - Modified for bonus
    val result = processNumbers(numberList, {it % 2 != 0} , {it * it})
    println(result)
}

// Part 2
fun filterNames(names: List<String>, filter: (String) -> Boolean): List<String> {
    return names.filter(filter)
}

// Part 4
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

// part 5 - Modified for bonus
fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, transform: (Int) -> Int): List<Int> {
    val evenFilter = numbers.filter(filter)
    return evenFilter.map(transform)
}