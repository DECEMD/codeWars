fun main() {
    println(arrayTo(intArrayOf(744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358)).contentToString())
}
fun arrayTo(arr: IntArray): IntArray {
    val mutableList = arr.toMutableList()
    var summedResult = mutableListOf<Int>()

    if (mutableList.size == 0) {
        summedResult.add(0)
        return summedResult.toIntArray()
    } else {
        for(i in mutableList.indices){
            summedResult.add(mutableList.sumOf { it })
            mutableList[i] = 0
        }
    }
    summedResult.add(0)
    return summedResult.toIntArray()
}

//sum the mutableList and add it to the summedResult
//remove first element of the mutableList and iterate till 0 elements