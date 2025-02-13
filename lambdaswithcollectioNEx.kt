fun main(){

    //1
    val listOfInt = listOf(1,2,3,4,5,6,7,8,9,10)
    val doubleresult = listOfInt.map {it *2}
    println(doubleresult)

    //2
    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    val filteredResult = filterNames(names) { it.startsWith("A") }
    println(filteredResult)

    //3
    val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val result = words.sortedByDescending{it.length}
    println(result)

    //4
    fun customFilter(numbers : List<Int> , filter: (Int)-> Boolean) : List<Int>{
        return numbers.filter(filter)
    }
    val mylist = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val numbersGreaterThanFifteen = customFilter(mylist) { it > 5 }
    println(numbersGreaterThanFifteen)

    val evenNumbers = customFilter(mylist) {it % 2 ==0}
    println(evenNumbers)

    val oddNumbers = customFilter(mylist) { it % 3 == 0}
    println(oddNumbers)

    
    //5
    fun processNumbers(num : List<Int>): List<Int> {
        return num
            .filter { it % 2 != 0 }
            .map { it * it }
    }
    val mylist2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val resultOfProcessNumbers = processNumbers(mylist2)
    println(resultOfProcessNumbers)
















}
//2
fun filterNames (names: List<String>, condition: (String) -> Boolean): List<String> {
    return names.filter(condition)

}







