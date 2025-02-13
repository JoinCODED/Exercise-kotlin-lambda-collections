fun main() {
    val InitialNumbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val DoubledNumbers = InitialNumbers.map { it * 2 }
    println(DoubledNumbers)
}
