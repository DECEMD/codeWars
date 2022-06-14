fun main(){
    println(longestRepetition("aaabaaabbb"))
    println(longestRepetition(""))
}

fun longestRepetition(s: String): Pair<Char?,Int> {
    var counter = 1
    var iteratingChar = ""
    val mutableListMap = mutableListOf<Pair<String, Int>>()

    for(i in s.indices){
        if(s[i].toString() == iteratingChar){
            counter++
        }else{
            counter = 1
            iteratingChar = s[i].toString()
        }
        mutableListMap.add(Pair(iteratingChar, counter))
    }

    return if (s.isNotEmpty()) Pair(
        mutableListMap.maxByOrNull { it.second }?.first?.get(0),
        mutableListMap.maxByOrNull { it.second }!!.second)
    else Pair(null, 0)
}

