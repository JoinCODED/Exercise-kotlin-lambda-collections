fun main() {
    val numbers= listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(processNumbers(numbers))
}
fun processNumbers(numbers: List<Int>): List<Int> {
    return (numbers.filter {it%2!=0}).map{it*it}
}