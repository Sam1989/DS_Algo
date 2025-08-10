package arrays

fun main() {
    val arr = arrayListOf(4, 8, 2, 3, 11, 5, 9, 8, 7)
    val reverseArr = ArrayList<Int>(arr.size)
    for (i in arr.size - 1 downTo 0) {
        print(arr[i])
        reverseArr.add(arr[i])
    }
    println("Reverse array $reverseArr")
}