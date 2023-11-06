/*
Question: count all the factors for the given number

Time Complexity: O(n)

Space Complexity: O(1)
*/

fun countFactors(n: Int): Int {
    if (n <= 0) return -1 // Handle non-positive inputs

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
    return count
}

fun main() {
    val number = readLine()?.toInt()

    if (number != null) {
        println(countFactors(number))
    } else {
        println(-1)
    }
}
