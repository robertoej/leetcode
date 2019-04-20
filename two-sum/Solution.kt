class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val diffsMemo = mutableMapOf<Int, Int>()
        
        for ((i, n) in nums.withIndex()) {
            
            val diff = target - n
            
            if (diffsMemo.contains(n)) {
                
                return intArrayOf(diffsMemo.get(n)!!, i)
            } else {

                diffsMemo.put(diff, i)
            }
        }
        
        return intArrayOf()
    }
}
