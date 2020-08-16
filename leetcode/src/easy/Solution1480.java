package easy;

/**
 * 1480. Running Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * 
 * @author eabsin
 *
 */
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        
        return nums;
    }
}
