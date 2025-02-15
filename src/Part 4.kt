fun customFilter(numbers: List<Int>, filterFun: (Int) -> Boolean): List<Int>{
    return numbers.filter(filterFun)
}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(customFilter(numbers) {it > 5})
    println(customFilter(numbers) {it % 2 == 0})
    println(customFilter(numbers) {it % 3 == 0})

}