package basicalgo

fun main() {
    fib2()
}

// 1. Fibonacci Series Using the Iterative Approach
// Time Complexity: O(N)
// Auxiliary Space: O(1)
fun fib1() {
    val num = 7
    var num1 = 0
    var num2 = 1
    for (i in 0..num) {
        print("$num1, ")
        val num3 = num1 + num2
        num1 = num2
        num2 = num3
    }
}

// 2. Fibonacci Series Using Recursive Approach
// Time Complexity: O(2N)
// Auxiliary Space: O(n)
fun fib2() {
    for (i in 0..5) {
        print("${recursionSeries(i)}, ")
    }
}

fun recursionSeries(n: Int): Int {
    if (n <= 1) return n
    return recursionSeries(n - 1) + recursionSeries(n - 2)
}