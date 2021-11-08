fun findScreenHeight(width: Int, ratio: String): String {
    
    var list = ratio.split(":") // tried with str.replace()
    var kok = list.map { it.toString().toDouble() } // char.code ( toInt() depricated)
    var coeff = kok[1] / kok[0]
    var height = width * coeff
    
    return "${width}x${height.toInt()}"

}
fun main(){
    findScreenHeight(1280,"16:9")
}

