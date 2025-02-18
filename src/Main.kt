fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val transformedNumbers = numbers.map { it * 2 }
    println(transformedNumbers)

    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filterNames = { listOfName: List<String> -> listOfName.filter { it.contains("a", true) } }
    println(filterNames(names))

    val fruits = listOf("apple", "banana", "kiwi", "strawberry", "grape")

    println(fruits.sortedByDescending { it.length })

    fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
        return numbers.filter { filter(it) }
    }
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })
// Output: [6, 7, 8, 9, 10]

    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })
// Output: [2, 4, 6, 8, 10]

    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })
// Output: [3, 6, 9]

    fun processNumbers(numbers: List<Int>): List<Int> {
       val oddNumbers = numbers.filter { it % 2 != 0 }
        return oddNumbers.map { it * it }
    }

    println(
        processNumbers(
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        )
    )
}