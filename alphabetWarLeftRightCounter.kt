fun alphabetWar(fight: String): String {
    var counterLeft = 0
    var counterRight = 0
    lateinit var count: String //var for return
    for(i in fight){
        if(i == 'w'){
            counterLeft = counterLeft + 4
        } else if(i == 'p'){
            counterLeft = counterLeft + 3
        } else if(i == 'b'){
            counterLeft = counterLeft + 2
        } else if(i == 's'){
            counterLeft = counterLeft + 1
        } else if(i == 'm'){
            counterRight = counterRight + 4
        } else if(i == 'q'){
            counterRight = counterRight + 3
        } else if(i == 'd'){
            counterRight = counterRight + 2
        } else if(i == 'z'){
            counterRight = counterRight + 1
        }
    }
    if(counterLeft > counterRight){
        count = "Left side wins!"
    } else if(counterLeft < counterRight){
        count = "Right side wins!"
    } else {
        count = "Let's fight again!"
    }
    return count
}
fun main(){
    alphabetWar("zzzzszzzwpppp")
}