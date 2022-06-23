fun main(){
    println(solution("apples, plums % and bananas\npears\noranges !applesauce", charArrayOf('%', '!')))
}
fun solution(input: String, markers: CharArray): String {
    val mutableList = mutableListOf<String>()
    val splitInput = input.split("\n")
        for (i in splitInput){
            var l = 0
            var counter = 0
            for (j in i){
                if (j in markers){
                    l = 1
                    mutableList.add(i.slice(0 until counter).dropLastWhile { it.isWhitespace() } + "\n")
                    break
                }
                counter++
            }
            if (l == 0){
                mutableList.add(i.dropLastWhile { it.isWhitespace() } + "\n")
            }
        }
        return mutableList.joinToString(separator = "").dropLast(1)
}

//remove chars after markers and return string
