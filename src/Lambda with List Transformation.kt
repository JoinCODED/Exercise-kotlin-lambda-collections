val transformation = { n: Int -> n * 2 }

fun main (){
    val numbers = mutableListOf( 1,2,3,4,5,6,7,8,9,10)
   var n = numbers.map(transformation)
  println(n)
    }