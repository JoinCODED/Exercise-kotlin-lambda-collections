fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(processNumbers(numbers, {it%2!=0}, {it*it}))
}

fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, transform: (Int) -> Int): List<Int> {
    return numbers.filter(filter).map(transform)
}
