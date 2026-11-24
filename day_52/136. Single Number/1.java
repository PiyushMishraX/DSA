class Solution {
    public int singleNumber(int[] nums) {
        
        // int n = nums[0];
        int result = 0;
        
        
        
        // for ( int i : nums ){
         for ( int i = 0; i < nums.length; i ++ ){
             result= result ^ nums[i];
            
            
        }
        
        return result;
        
    }
}