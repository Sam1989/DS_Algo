package basicalgo

fun main() {
    val num1 = 5   // Binary: 101
    val num2 = 3   // Binary: 011
    println("Sum: ${addBinaryNumber(num1, num2)}") // Output: 8
}

fun addBinaryNumber(a: Int, b: Int): Int {
    var x = a
    var y = b
    while(y != 0) {
        val carry = x and y
        x = x xor y
        y = carry shl 1
    }
    return x
}