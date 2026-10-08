

class Solution {
    // public int majorityElement(int[] nums) {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};


        int number = 0;

        // int max = Integer.MIN_VALUE; // not required check if count > n/2 as one value always present being > n/2 appearance also only one cna have this feat so no need to store max
        for( int i = 0; i < nums.length; i ++) {
            // int count = 0;
            int count = 1; // should be one as any element checked is atleast one time
            for(int j = i + 1; j < nums.length; j ++) {
                if( nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                // return nums[i];
                number = nums[i];
                break;
            }
        }

        // return 0;
        // return number;


        System.out.println( number );        
    }
}