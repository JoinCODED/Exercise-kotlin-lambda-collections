fun processNumbers (numbers: List<Int>): List<Int> {
    val oldNumbers = numbers.filter { it % 2 != 0 }
    return oldNumbers.map { it * it }
}
fun  main (){
    val inputNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val processedList = processNumbers(inputNumbers)
    println(processedList)
}