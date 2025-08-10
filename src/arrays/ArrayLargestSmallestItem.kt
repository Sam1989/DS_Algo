package arrays

fun main() {
    val nums = intArrayOf(4, 8, 2, 3, 11, 5, 9, 8, 7)
    var largestItem = nums[0]
    var smallestItem = nums[0]
    for(i in 0..<nums.count()) {
        if (largestItem < nums[i]) {
            largestItem = nums[i]
        }
        if (smallestItem > nums[i]) {
            smallestItem = nums[i]
        }
    }
    println("largest item is $largestItem")
    println("smallest item is $smallestItem")
}