package easy;

/**
 * 1512. Number of Good Pairs
 * https://leetcode.com/problems/number-of-good-pairs/
 * 
 * @author eabsin
 *
 */
public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    goodPairs++;
                }   
            }
        }
        
        return goodPairs;
    }
}
