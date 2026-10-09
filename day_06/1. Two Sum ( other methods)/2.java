import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map< Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)) { // if a prev existing value is complement than return
                return new int[]{map.get(complement), i}; 
            }
            map.put(nums[i], i ); // the key put into map for further use for next elment iterations
        }

        return new int[]{};

    }
}