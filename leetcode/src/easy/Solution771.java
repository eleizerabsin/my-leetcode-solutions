package easy;

import java.util.HashSet;

/**
 * 771. Jewels and Stones
 * https://leetcode.com/problems/jewels-and-stones/submissions/
 * 
 * @author eabsin
 *
 */
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        int count = 0;
        
        for (char c : J.toCharArray()) {
            jewelSet.add(c);
        }
        
        for (char c : S.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }
        
        return count;
    }
}
