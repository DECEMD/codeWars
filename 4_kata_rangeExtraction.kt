fun main(){
    println(rangeExtraction(intArrayOf(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)))
}
fun rangeExtraction(arr: IntArray): String {
    val listOfLists = mutableListOf<MutableList<Int>>()
    val arrToList = arr.toMutableList()
    var listForIterator = mutableListOf(arrToList[0])
    val emptyList = emptyList<Int>()
    var returningValue = ""

        for (i in 1 until  arrToList.size){
            if (arrToList[i] - arrToList[i - 1] == 1){
                listForIterator.add(arrToList[i])
            } else {
                listOfLists += listForIterator
                listForIterator = emptyList.toMutableList()
                listForIterator.add(arrToList[i])
            }
        }
    listOfLists += listForIterator
    for (i in listOfLists){
        if (i.size > 2){
            returningValue = returningValue + i.first() + "-" + i.last() + ","
        } else {
            returningValue += i.joinToString(",") + ","
        }
    }
    return returningValue.dropLast(1)
}
/*
A format for expressing an ordered list of integers is to use a comma separated list of either

individual integers
or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'.
The range includes all integers in the interval including both endpoints.
It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.
 */