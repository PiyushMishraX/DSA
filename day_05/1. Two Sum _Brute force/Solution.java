
// 1. Two sum ( pair with given sum ( unique elements ( only one )))
// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.



// Brute force
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for( int i =0; i < nums.length; i ++) {
            // for(int j = 0; j < nums.length; j ++){
            //     // if(i != j) {
            //     //     if(arr[i] + arr[j] )
            //     // }
            //     if(i == j)
            //     continue; 
            //     if( nums[i] + nums[j] == target  ){
            //         arr[0] = i;
            //         arr[1] = j;
            //         // arr = { i , j };
            //     }
                
            // }

            for(int j = i+1; j < nums.length; j ++){
                if(i == j)
                continue; 
                if( nums[i] + nums[j] == target  ){
                    arr[0] = i;
                    arr[1] = j;
                }
                
            }
        }

        return arr;
        
    }
}

