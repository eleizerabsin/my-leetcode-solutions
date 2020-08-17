package medium;

/**
 * 1395. Count Number of Teams\
 * https://leetcode.com/problems/count-number-of-teams/
 * 
 * @author eabsin
 *
 */
public class Solution1395 {
    public int numTeams(int[] rating) {
        int num = 0;
        
        if (rating == null || rating.length <= 3) {
            return num;
        }
        
        int team = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < rating.length; j++) {
                for (int k = 0; k < rating.length; k++) {
                    if (((rating[i] < rating[j] && rating[j] < rating[k])
                    		|| (rating[i] > rating[j] && rating[j] > rating[k]))
                    		&& (i < j && j < k)) {
                        team++;
                    } 
                }
            }
        }
        
        return team;
    }
}
