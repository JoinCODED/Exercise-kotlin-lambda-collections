

fun filterNames (listNames: List<String>, filterFun: (String) -> Boolean): List<String> {
    return listNames.filter(filterFun)

}
fun main() {
  val  listNames = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
val namesStartingWithA = filterNames(listNames) {it.startsWith("A")}
    println(namesStartingWithA)
}