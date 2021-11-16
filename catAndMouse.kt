fun catMouse(s: String): String {
    val reg = Regex("[\\w]*") // creating a regex object
    var repl = s.replace(reg,"")
    var answer = 0
    lateinit var returner: String
    for(i in repl){
        answer++
    }
    if(answer > 3){
        returner = "Escaped!"
    } else{
        returner = "Caught!"
    }
    return returner
}

fun main(){
    catMouse("C....m")
}