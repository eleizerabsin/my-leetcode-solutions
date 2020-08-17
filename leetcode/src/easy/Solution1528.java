package easy;
/**
 * 1528. Shuffle String
 * https://leetcode.com/problems/shuffle-string/
 * 
 * @author eabsin
 *
 */
public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[indices.length];
        
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            shuffled[index] = s.charAt(i);
        }
        
        return String.valueOf(shuffled);
    }
}
