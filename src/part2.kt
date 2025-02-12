fun main() {
    val namesList = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David");

    println(filterNames(namesList, startsWithA ))
}

fun filterNames(textList: List<String>, callBack: (String) -> Boolean): List<String> {
    return textList.filter(callBack);
}

val startsWithA: (String) -> Boolean = { text -> text.startsWith('A')}