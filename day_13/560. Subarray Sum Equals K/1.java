class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        
        int sumCurrent = 0;
        int count = 0; // subarrays

        for (int i = 0; i < nums.length; i++) {
            sumCurrent += nums[i];
            
            int target = sumCurrent - k;
            if ( map.containsKey(target) ) {
                
                count = count + map.get(target);
            }
            

            map.put( sumCurrent, map.getOrDefault( sumCurrent, 0 ) + 1);
        }
        
        return count;
    }
}
