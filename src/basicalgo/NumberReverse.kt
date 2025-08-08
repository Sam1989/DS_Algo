package basicalgo

fun main() {
    var num = 12345
    var rem: Int
    var sum = 0
    while (num > 0) {
        rem = num % 10
        sum = rem + sum * 10
        num /= 10
    }
    println("Reverse number: $sum")
}