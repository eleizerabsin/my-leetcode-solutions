package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1282. Group the People Given the Group Size They Belong To
 * https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 * 
 * @author eabsin
 *
 */
public class Solution1282 {	
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groupList = new ArrayList<List<Integer>>();
        
        // create buckets
        HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
        	hashMap.put(groupSizes[i], new ArrayList<Integer>());
        }
        
        // insert values to buckets
        for (int i = 0; i < groupSizes.length; i++) {
        	List<Integer> group = hashMap.get(groupSizes[i]);
        	group.add(i);
        }
        
        // iterate through bucket
        for (Map.Entry<Integer, List<Integer>> set : hashMap.entrySet()) {
        	List<Integer> group = set.getValue();
        	
        	// if bucket size is greater than group size
        	if (group.size() > set.getKey()) {
        		// divide to sub lists
        		List<Integer> newGroup = new ArrayList<Integer>();
        		for(int i = 0; i <= group.size(); i++) {
        			if(i % set.getKey() == 0 && newGroup.size() > 0) {
        				groupList.add(newGroup);
        				newGroup = new ArrayList<Integer>();
        			}
        			
        			if(i != group.size()){
        				newGroup.add(group.get(i));
        			}
        		}
        	} else {
        		groupList.add(group);
        	}
        }
        
        return groupList;
    }
}
