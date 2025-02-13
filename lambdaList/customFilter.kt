fun customFilter(numbers: List<Int>,
                 filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}
fun main (){
    val greaterThan = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8,
        9, 10))
    {it > 5}
    println(greaterThan)
    val evenNumbers = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8,
        9, 10))
    {it % 2 == 0}
    println(evenNumbers)
    val multiplesOf3 = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8,
        9, 10))
    {it % 3 == 0 }
    println(multiplesOf3)
}