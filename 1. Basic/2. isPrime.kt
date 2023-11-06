/*
Question: find whether given number is prime of not

Time Complexity: O(n)

Space Complexity: O(1)
*/

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false // 0 and 1 are not prime

    var count = 0
    for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            if (i == n / i) {
                count++ // add 1 if both the factors are same. e.g. 5 * 5 = 25
            } else {
                count += 2 // factors are always in pair
            }
        }
    }
    return count == 2 // A prime number has exactly 2 factors
}

fun main() {
    val number = readLine()?.toInt()

    if (number != null) {
        println(isPrime(number))
    } else {
        println(-1)
    }
}
