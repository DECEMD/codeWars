fun main(){
    longest("inmanylanguages", "theresapairoffunctions")
}

fun longest(s1:String, s2:String): String {
    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()
    s1.forEach{
        set1 += "$it"
    }
    s2.forEach{
        set2 += "$it"
    }
    set1.addAll(set2)
    return set1.sorted().joinToString("")
}

/*
Take 2 strings s1 and s2 including only letters from ato z.
Return a new sorted string, the longest possible,
containing distinct letters - each taken only once - coming from s1 or s2.
*/