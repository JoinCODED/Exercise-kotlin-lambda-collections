val sort = { n: String -> n.contains("A")  }

fun main (){
    val names = mutableListOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
   var n = names.map(sort)
println(n)
}