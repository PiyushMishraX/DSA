class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Time limit exceeds ( TLE ) // due to   n = 10^5 which pushes out of 10^8 simple operationns // so use array sort and match adjacent if any found same than the duplicate consisits

        for( int i = 0 ; i < nums.length; i ++){
            // for(int j = 0; j < nums.length; j ++){
            for(int j = i + 1; j < nums.length; j ++){ // because the previoous ones can't be same as already hav ebe checked
                // if(i == j ) // no need in J = i +1
                // continue;
                if( nums[i] == nums[j])
                return true;
            }
        }

        return false;
        
    }
}