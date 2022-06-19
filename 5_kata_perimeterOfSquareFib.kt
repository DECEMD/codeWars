import java.math.BigInteger

fun main(){
    println(perimeter(10000))
}
    fun perimeter(n: Int): BigInteger {
        val fib = mutableListOf(BigInteger("1"), BigInteger("1"))
        for (i in 2 .. n)
            fib.add(fib[i-2]+fib[i-1])
        return fib.sumOf { it }*BigInteger("4")
    }

//find fibonacci numbers until n and sum them