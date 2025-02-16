fun main() {
    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = processNumbers(numbers)
    println(result)
}
fun processNumbers(numbers: List<Int>): List<Int> {
    val oddNumbers = numbers.filter { it % 2 != 0 }
    val squaredNumbers = oddNumbers.map { it * it }
    return squaredNumbers
}


