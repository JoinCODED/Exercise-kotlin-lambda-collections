val intList = listOf(1,2,3,4,5,6,7,8,9,10,30)


fun main() {

    val multiplyList: (List<Int>) -> List<Int> = { it.map {  index -> index * 2 } }

    println(intList)

    println(multiplyList(intList))
}