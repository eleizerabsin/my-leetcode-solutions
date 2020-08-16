package easy;

/**
 * 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 * 
 * @author eabsin
 *
 */
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        
        //position 1st half of nums
        int j = 0;
        for(int i = 0; i < n; i++) {
            result[j] = nums[i];
            j+=2;
        }
        
        //position 2nd half of nums
        j = 1;
        for(int i = n; i < nums.length; i++) {
            result[j] = nums[i];
            j+=2;
        }
        
        return result;
    }
}
