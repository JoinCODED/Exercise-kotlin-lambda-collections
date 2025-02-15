fun main() {
    fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
        return numbers.filter(filter)
    }

    val result1 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 }
    println(result1)

    val result2 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 }
    println(result2)

    val result3 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 }
    println(result3)
}
