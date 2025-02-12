fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbersSquared = processNumbers(
        numbers, condition = { it % 2 != 0 }, transform = { it * it }
    )

    println(oddNumbersSquared)
}

fun processNumbers(
    numbers: List<Int>,
    condition: (Int) -> Boolean,
    transform: (Int) -> Int
): List<Int> {
    return numbers.filter(condition).map(transform)
}