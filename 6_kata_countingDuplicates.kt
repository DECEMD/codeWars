fun duplicateCount(text: String): Int =
    text.lowercase()
    .groupingBy { it }.eachCount() // map<char, int>
    .count { it.value > 1 } // counts all entries in the map where the count is more than one

fun main(){
    duplicateCount("aaaccbde")
}