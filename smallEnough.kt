fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var verif: Boolean? = null
    for(i in a){
        if(i <= limit) verif = true else verif = false
    }
    return verif!!
}
fun main(){
    smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100)
}