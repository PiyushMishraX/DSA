import java.util.HashMap;

class Solution {


    // public static void main(String[] args) {
    //     int a = longestConsecutive( new int[]{0,3,7,2,5,8,4,6,0,1});
    //     System.out.println(a);

    // }

    // tle due to have too much differences in max and min 
    public int longestConsecutive(int[] nums) {

        if( nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            map.put( num, map.getOrDefault( num,0) + 1);

            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int order = 1;
        int longestOrder = 1;

        // int order = map.get(min);
        // int longestOrder = map.get(min);

        for( int i = min+1; i <= max; i++){

            if( !map.containsKey(i)){
                continue;
            }

            if( map.containsKey(i - 1)){
                // order += map.get(i);
                order += 1;
                longestOrder = Math.max( order, longestOrder);
                continue;
            }


            // longestOrder = Math.max( order, longestOrder);
            order = 1;
        }

        return longestOrder;
        
    }
}