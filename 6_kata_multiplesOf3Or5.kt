fun main(){
    println(solution(10))
    println(solution(20))
    println(solution(200))
}

fun solution(number: Int): Int {
    val mutableList = mutableListOf<Int>()

    for(i in 1 until number){
        if(i % 3 == 0 || i % 5 == 0){
            mutableList.add(i)
        }
    }
    return mutableList.sumOf { it }
}

//sum of all the numbers that are divisible by 3 or 5 below the number