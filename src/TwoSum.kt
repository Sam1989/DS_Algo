//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)
    println("Indices: ${result.joinToString()}")
}


fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(map[diff]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}