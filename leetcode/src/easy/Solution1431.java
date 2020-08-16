package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * 
 * @author eabsin
 *
 */
public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> maxList = new ArrayList<Boolean>();
        
        // find the max number in array
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        
        // compare each candies + extra to max
        for(int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= max) {
                maxList.add(true);
            } else {
                maxList.add(false);
            }
        }
        
        return maxList;
    }
}
