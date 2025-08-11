package arrays


fun main() {
    print(findMissingNumber())
}

fun findMissingNumber(): Int {
    val arr = arrayListOf(1, 2, 4, 5)
    val n = arr.size + 1
    val totalSum = n * (n + 1) / 2
    val arrSum = arr.sum()
    val missing = totalSum - arrSum
    return missing
}