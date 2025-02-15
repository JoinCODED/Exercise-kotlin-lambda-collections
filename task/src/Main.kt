
fun filterNames(names: List<String>, condition: (String) -> Boolean): List<String> {
    return names.filter(condition)
}
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

fun processNumbers(number: List<Int>): List<Int> {
    val filteredNumbers = number.filter { it % 2 != 0 }

    val squaredNumbers = filteredNumbers.map { it * it }

    return squaredNumbers
}
//fun processNumbers1(
//    number: List<Int>,
//    filter: (Int) -> Boolean,
//    transform: (Int) -> Int
//): List<Int> {
//    return number.filter(filter).map(transform)
//}

val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")

fun main() {
   val doubleNumbers = numbers.map { it * 2 }

    println(doubleNumbers)

    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    val filteredNames = filterNames(names) { it.startsWith("A") }
    println(filteredNames)

    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val greaterThanFive = customFilter(numbers) { it > 5 }
    println("Numbers greater than 5: $greaterThanFive")

    val evenNumbers = customFilter(numbers) { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    val multiplesOfThree = customFilter(numbers) { it % 3 == 0 }
    println("Multiples of 3: $multiplesOfThree")

    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = processNumbers(number)

    println(result)
}