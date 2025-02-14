fun main() {
    // part 1
    println("Part 1:");
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("[*] ${nums.map {it * 2}}");

    // part 2
    println("\nPart 2:");
    val names = mutableListOf<String>("Alice", "Bob", "Amir", "Charlie", "Annie", "David");
    println("[*] ${filterNames(names) { it.contains("A" )}}");

    // part 3
    println("\nPart 3:");
    val fruits = listOf<String>("apple", "banana", "kiwi", "strawberry", "grape");
    println("[*] ${fruits.sortedByDescending { it.length }}")

    // part 4
    println("\nPart 4:");
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("[*] ${customFilter(numbers) { it > 5 }}");
    println("[*] ${customFilter(numbers) { it % 2 == 0 }}");
    println("[*] ${customFilter(numbers) { it % 3 == 0}}");

    // part 5
    println("\nPart 5:");
    val numberSquare = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("[*] ${processNumbers(numberSquare, {it % 2 != 0}, {it * it})}");


}

fun filterNames( names: MutableList<String>, filter: (String) -> Boolean ): List<String>{
    return names.filter(filter);
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter);
}

fun processNumbers(numbers: List<Int>, filterEven: (Int) -> Boolean, filterSquare: (Int) -> (Int)): List<Int> {
    var numEven = numbers.filter(filterEven);
    var numSquare = numEven.map(filterSquare);
    return numSquare;

}
