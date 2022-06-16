fun main(){

    var firstElement = formatDuration(100000).first()
    var secondElement = formatDuration(100000).last()

    while (secondElement != 0){
        if (secondElement in 1..59){
            firstElement = "$firstElement and ${formatDuration(secondElement as Int).first()}"
        } else
            firstElement = "$firstElement, ${formatDuration(secondElement as Int).first()}"

        secondElement = formatDuration(secondElement).last()
    }
    println(firstElement)

}

fun formatDuration(seconds: Int): MutableList<Any> {
    val whenList = mutableListOf<Any>()
    when (seconds) {
        0 -> whenList.add("now") && whenList.add(0)
        in 1..59 -> whenList.add("$seconds second") && whenList.add(0)
        in 60..3599 -> whenList.add("${seconds / 60} minute") && whenList.add(seconds % 60)
        in 3600..86399 -> whenList.add("${seconds / 3600} hour") && whenList.add(seconds % 3600)
        in 86400..31535999 -> whenList.add("${seconds / 86400} day") && whenList.add(seconds % 86400)
        in 31536000..315359999 -> whenList.add("${seconds / 31536000} year") && whenList.add(seconds % 31536000)
    }
    return whenList

//    val years: Int = (seconds / 31536000)
//    val days: Int = (seconds / 86400) % 365
//    println("$years")

}