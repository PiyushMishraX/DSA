class Solution {
    public int[] twoSum(int[] nums, int target) {



        // HashMap -->

        // int[] arr = new int[2];

        // // HashMap<int, int  > // no int
        // HashMap<Integer, Integer > map = new HashMap<>();
        // for(int i = 0; i < nums.length ; i ++) {
        //     map.put( nums[i], i);
        // }

        // for(int i = 0; i < nums.length; i++){
        //     // int find = target - nums[i];
        //     // if( map.containsKey(find) ) {
        //     //     arr[0] = i;
        //     //     arr[1] = map.get(find);
        //     // }

        //     int find = target - nums[i];
        //     if( map.containsKey(find) == false) continue;
        //     int index = map.get(find);// in case of elemment isn't the one with the value of find isn't existing
        //     if( index == i ) 
        //         continue;
        //     if( map.containsKey(find) ) {
        //         arr[0] = i;
        //         arr[1] = map.get(find);
               // //  should break here
        //     }
        // }
        
        // return arr;



        // faster two loops one
        // for(int i = 1; i < nums.length; i ++) {
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] + nums[j - i]  == target){
        //             return new int[]{j , j - i};
        //         }

        //     }
        // }
        // return new int[]{};


        // two pass hash map

        // Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for( int i = 0 ; i < n ; i ++){
            map.put(nums[i], i);
        }

        for( int i =0; i < n ; i ++){
            int find = target - nums[i]; // complement
            if( map.containsKey(find) && map.get(find) != i){
                return new int[]{ i , map.get(find)};
            }
        }

        return new int[]{}; // no solution

    }
}