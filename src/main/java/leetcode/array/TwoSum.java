package leetcode.array;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // MySolution
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum_recommand(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }
        return null;

    }
}
