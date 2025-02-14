fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, transform: (Int) -> Int): List<Int> {
    // for the bonus question, it was a bit harder
    // although by adding transform it modifies them by squaring or multiplying
    //whereas previously it was just squaring them with it*it only
    return numbers.filter(filter).map(transform)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = processNumbers(numbers, { it % 2 != 0 }, { it * it })
    println(result)
}

