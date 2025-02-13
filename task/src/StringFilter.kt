fun main(){

        val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
        val filteredNames = filterNames(names) {it ->
            it.startsWith("A")}

        println(filteredNames)
    }

    fun filterNames(names: List<String>, filter: (String) -> Boolean): List<String> {
        return names.filter(filter)
    }
