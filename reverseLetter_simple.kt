fun reverseLetter(str: String): String {
    val reg = Regex("[^A-Za-z]") // creating a regex object
    var repl = reg.replace(str, "")
    var answer = ""
    for(i in repl.length - 1 downTo 0){
        answer += repl[i]
    }
    return answer.toString()
}

fun main(){
    reverseLetter("ultr53o?n")
}