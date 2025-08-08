package basicalgo

fun main() {
    var num = 153
    var o_num = num
    var rem: Int
    var sum = 0
    while (num > 0) {
        rem = num % 10
        sum += (rem * rem * rem)
        num /= 10
    }
    if (o_num == sum) {
        println("Number is armstrong: $sum")
    } else {
        println("Number not armstrong")
    }
}