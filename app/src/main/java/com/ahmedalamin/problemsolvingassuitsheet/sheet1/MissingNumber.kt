package com.ahmedalamin.problemsolvingassuitsheet.sheet1



class Solution22 {
    fun missingNumber(nums: IntArray): Int {

        var totalSum = nums.size*(nums.size +1)/2
        var arraySum = 0

        for (i in nums){
            arraySum+=i
        }
        return totalSum - arraySum
    }
}