package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 1447. Simplified Fractions
 * https://leetcode.com/problems/simplified-fractions/
 * 
 * @author eabsin
 *
 */
public class Solution1447 {
	public List<String> simplifiedFractions(int n) {
        List<String> fractions = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        
        int j = 1;
        for (int i = j; i <= n; i++) {
        	if ((j/i) < 1 && !values.contains((float)j/i)) {
                String fraction = String.valueOf(j) + "/" + String.valueOf(i);
                fractions.add(fraction);
                values.add((float)j/i);
            }
        		
    		if (i == n) {
    			i = ++j;
    		}
        }
        
        return fractions;
    }
}
