
fun getCount(str : String) : Int {
    var count = 0
    var listt = str.split("".toRegex()).map { it.trim() } //idk im lucky that i found this
    for(i in listt){
        if(i == "a"){
            count++
        } else if (i == "e"){
            count++
        } else if (i == "i"){
            count++
        } else if (i == "o"){
            count++
        } else if (i == "u"){
            count++
        }
    }
    return count
}