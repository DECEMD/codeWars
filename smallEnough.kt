fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var veriff: Boolean? = null
    for (i in a){
        if (i > limit) {
            veriff = false 
            break
        } else {
            veriff = true
        }
    }
    return veriff!!
}
fun main(){
    smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)
}