package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

}


class Solution {
    fun thirdMax(nums: IntArray): Int {
        var max1:Long = Int.MIN_VALUE -1L
        var max2:Long = Int.MIN_VALUE -1L
        var max3:Long = Int.MIN_VALUE -1L

        for ((index,value) in nums.withIndex()){
            if (nums[index].toLong() > max1){
                max3 = max2
                max2= max1
                max1 = nums[index].toLong()
            }
            else if (nums[index].toLong() > max2 && nums[index].toLong() != max1){
                max3 = max2
                max2 = nums[index].toLong()
            }
            else if (nums[index].toLong() > max3 && nums[index].toLong() !=max2 && nums[index].toLong() !=max1){
                max3 = nums[index].toLong()
            }
        }

        if (max3 == Int.MIN_VALUE-1L){
            return max1.toInt()
        }

        return max3.toInt()
    }
}