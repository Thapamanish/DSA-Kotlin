/*  
Question : count all the factors for the given number

Time Complexity: O(n)

Space Complexity : O(1)

Intution : factors are always in pair
*/



fun countFactors(n: Int?): Int {
    if (n == null || n <= 0) return -1  

    var count = 0
    for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            if (i == n / i) {
                count++
            } else {
                count += 2
            }
        }
    }
    return count
}

fun main() {
    val number = readLine()?.toInt()
    println(countFactors(number))
}
