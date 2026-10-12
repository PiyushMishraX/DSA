import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
      

        // int closestSum = Integer.MAX_VALUE;  // overflow is occuring(might be occuring)      
        // int closestSum ;       
        int closestSum = 1000000001;       
        // int closestSum = nums[1] + nums[2] + nums[3]; // as the values are unique // can use it      

        // int minDiff = Integer.MAX_VALUE; 

        Arrays.sort(nums);

        for( int i = 0 ; i < n-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1]) 
                continue;
            
            int left = i + 1;
            int right = n - 1;
            

            while(left < right ){
                // int s = nums[left] + nums[right];

                // // int sum = nums[i] + nums[left] + nums[right];
                // int diff = Math.abs(s + nums[i] - target);

                // if(diff < minDiff) {
                //     minDiff = diff;
                //     closestSum = s + nums[i];
                // } 
                // // } else {
                // //     continue;
                // // }


                // if( s == target - nums[i]) {
                //     return target; // target here is equal to sum
                // }


                // else if ( s < target - nums[i]){
                //     left++;
                // }  else {
                //     right--;
                // }

                int s = nums[i] + nums[left] + nums[right];
                if(Math.abs(s - target) < Math.abs(closestSum - target)) {
                    closestSum = s;
                } 


                if( s == target ) { // behaves same as nums[left] + nums[right] == target - nums[i] as transfer nums[i] to other side
                    return target; 
                }


                else if ( s < target ){
                    left++;
                }  else {
                    right--;
                }


            }
        }


        return closestSum;
        
    }
}