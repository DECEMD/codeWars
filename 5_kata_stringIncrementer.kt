fun main(){
    println(incrementString("fooBar000"))
    println(incrementString("foo"))
    println(incrementString("2000foo1"))
    println(incrementString("000111"))
}

fun incrementString(str: String) : String {
    if(str.isEmpty()) {
        return "1"
    } else {
        return if (str.last().isDigit()) {
            val filteredStr = str.filterNot { it.isDigit() }
            val filteredDigits = str.filter { it.isDigit() }
            val lengthCounterOfDigits = filteredDigits.length
            var incrementedFilteredDigits = (filteredDigits.toInt() + 1).toString()
            val incrementedFilteredDigitsLength = incrementedFilteredDigits.length
            for (i in 0 until (lengthCounterOfDigits - incrementedFilteredDigitsLength)) {
                incrementedFilteredDigits = "0$incrementedFilteredDigits"
            }
            filteredStr + incrementedFilteredDigits
        } else{
            str + "1"
        }
    }
}
