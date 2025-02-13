fun main() {
    // Part 1
    val numbers = (1..10).toList()
    val numbersDoubled = numbers.map {it * 2}
    println(numbersDoubled)
    // Part 2
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val namesStartingWithA = filterNames(names) {it.startsWith("A")}
    println(namesStartingWithA)
    // Part 3
    val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val sortedWordsDescending = {listOfWords: List<String> -> listOfWords.sortedByDescending { it.length }}
    println(sortedWordsDescending(words))
    // Part 4
    println(customFilter(numbers){ it > 5 })
    println(customFilter(numbers){ it % 2 == 0 })
    println(customFilter(numbers){ it % 3 == 0 })
    // Part 5
    println(processNumbers(numbers))
    // Bonus
    val processedNumbers_Bonus = processNumbers_Bonus(numbers, { it % 2 != 0 })  { it * it}
    println(processedNumbers_Bonus)
}
// For Part 2
fun filterNames(names: List<String>, filterByFirstLetter: (String) -> Boolean): List<String>{
    return names.filter(filterByFirstLetter)
}
// For Part 4
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int>{
    return numbers.filter(filter)
}
// Part 5
fun processNumbers(numbers: List<Int>): List<Int>{
    return numbers.filter { it % 2 != 0 }.map { it * it }
}
// Bonus
fun processNumbers_Bonus(numbers: List<Int>, filterEvenNumbers: (Int) -> Boolean, squareNumbers: (Int) -> Int): List<Int>{
    return numbers.filter(filterEvenNumbers).map(squareNumbers)
}
