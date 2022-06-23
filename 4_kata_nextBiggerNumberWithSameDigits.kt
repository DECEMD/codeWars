fun main(){
    println(nextBiggerNumber(513))//531
    println(nextBiggerNumber(2017))//2071
    println(nextBiggerNumber(52871))//57128
    println(nextBiggerNumber(144))
    println(nextBiggerNumber(1211110))
    println(nextBiggerNumber(111))//111
}
fun nextBiggerNumber(n: Long): Long {
    val nList = n.toString().toMutableList().map { it.toString() }.map { it.toLong() }
    var counter = (n + 1).toString().toMutableList().map { it.toString() }.map { it.toLong() }.joinToString("").toLong()
    if (n == n.toString().toList().sortedDescending().joinToString(separator = "").toLong()){
        return -1L
    } else {
        while (nList.sortedByDescending { it }
            != counter
                .toString()
                .toMutableList()
                .map { it.toString() }
                .map { it.toLong() }
                .sortedByDescending { it }){
            counter++
        }
    }
    return counter
}