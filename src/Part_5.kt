fun main(){
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(processNumbers(numList))
}

fun processNumbers(numbers:List<Int>):List<Int>{
    var numbersFiltered = numbers.filter { it % 2 == 1 }
    return numbersFiltered.map { number -> number * number }
}