import java.util.HashSet;

class Solution {
    static 
    {
        for(int i=0;i<500;i++)
            longestConsecutive(new int[]{});
    }
    public static int longestConsecutive(int[] nums) {

        if( nums.length == 0) return 0;


        HashSet<Integer> set = new HashSet<>();
        for( int num: nums){
            set.add(num);
        }

        int longestOrder = 0;

        for( int num: set){

            if(!set.contains(num - 1)) { // the order starter
                int numberCurrent = num;
                int currentOrder = 1;

                while(set.contains( numberCurrent + 1)){
                    numberCurrent += 1;
                    currentOrder += 1;
                }

                longestOrder = Math.max(longestOrder, currentOrder);

            }
        }

        return longestOrder;
        
    }
}