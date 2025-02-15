fun main(){
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })

    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })

    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {

    var returnType = numbers.filter(filter)

    return returnType
    }