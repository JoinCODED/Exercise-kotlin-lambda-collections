fun main(){

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val processedNumbers = processNumbers(numbers)
    println(processedNumbers)

    //The bonus

    val filterOdd: (Int) -> Boolean = { it % 2 != 0 }
    val square: (Int) -> Int = { it * it }

    val processedNumbersBonus = processNumbersBonus(numbers, filterOdd, square)

    println(processedNumbersBonus)

}

fun processNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 }.map { it * it }
}

//The bonus
fun processNumbersBonus(numbers: List<Int>, filter: (Int) -> Boolean, transform: (Int) -> Int): List<Int> {
    return numbers.filter(filter).map(transform)
}