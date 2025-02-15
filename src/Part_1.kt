fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbersDoubled = numbers.map(double)
    println(numbersDoubled)
}

val double: (Int) -> Int = {number -> number * 2 }