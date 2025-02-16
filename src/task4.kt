fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val greaterThanFive = customFilter(numbers) { it > 5 }
    println("Numbers greater than 5: $greaterThanFive")

    val evenNumbers = customFilter(numbers) { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    val multiplesOfThree = customFilter(numbers) { it % 3 == 0 }
    println("Multiples of 3: $multiplesOfThree")
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

