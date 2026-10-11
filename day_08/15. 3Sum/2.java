import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> triplets = new ArrayList<>();


        Arrays.sort(nums);

        for( int i = 0 ; i < n-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1]) 
                continue;
            
            int left = i + 1;
            int right = n - 1;
            int sum = -1 * nums[i];

            while(left < right ){
                int s = nums[left] + nums[right];

                if( s == sum) {
                    
                    triplets.add(Arrays.asList(nums[left],nums[right],nums[i]));
                    
                    left++;

                    while (nums[left] == nums[left-1] && left < right) {
                        left++;
                    }
                }


                else if ( s < sum){
                    left++;
                }  else {
                    right--;
                }
            }
        }


        return triplets;
        
    }
}