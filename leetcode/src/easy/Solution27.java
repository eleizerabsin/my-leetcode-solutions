package easy;

/**
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 * 
 * @author eabsin
 *
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}
