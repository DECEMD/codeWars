fun main(){
    println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"))
    println(orderWeight("59544965313"))
    println(orderWeight("496636983114762"))
    println(orderWeight(""))

}

fun orderWeight(string: String): String {
    return if (string.isEmpty()) {
        string
    } else {
        val rTemp: MutableList<String> = mutableListOf()
        val returningVar = string.split(" ").sortedBy{ it.length }.sortedBy { it }.toMutableList()

        for (i in returningVar.indices) {
            rTemp.add(sumDigits(returningVar[i]).toString())
        }
        val mutableMap = mutableListOf<Pair<String, String>>()
        for (i in rTemp.indices) {
            mutableMap.add(returningVar[i] to rTemp[i])
        }
        mutableMap.sortedBy { it.first }.toMutableList().groupBy { it.second.toInt() }.entries.sortedBy { it.key }
            .map { it.value }
            .map { it.map { it.first } }.joinToString { it.joinToString(" ") }.replace(",", "")
    }

}
fun sumDigits(num: String): Int {
    var counter = 0
    for (i in num.toCharArray()) {
        counter += i.toString().toInt()
    }
    return counter
}

//return the value that was sorted by sum of each int into input string