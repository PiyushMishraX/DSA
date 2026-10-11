// Triplet with sum closest to target 
// return the closes sum
// no dduplicates --> exactly one solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        int closestSum = Integer.MAX_VALUE;       
        int minDiff = Integer.MAX_VALUE;       


        Arrays.sort(nums);

        for( int i = 0 ; i < n-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1]) 
                continue;
            
            int left = i + 1;
            int right = n - 1;
            

            while(left < right ){
                int s = nums[left] + nums[right];

                // int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(s + nums[i] - target);

                if(diff < minDiff) {
                    minDiff = diff;
                    closestSum = s + nums[i];
                } 
                // } else {
                //     continue;
                // }


                if( s == target - nums[i]) {
                    return target; // target here is equal to sum
                }


                else if ( s < target - nums[i]){
                    left++;
                }  else {
                    right--;
                }
            }
        }


        return closestSum;
        
    }
}