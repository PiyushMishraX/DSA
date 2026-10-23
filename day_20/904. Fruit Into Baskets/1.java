class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int left = 0;
        int max = 0; // max length/ maximum number of fruits

        // HashMap<Integer, Integer> frequency = new HashMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        // in any window that is valid we should have only 2 types of fruits to be picked

        for( int right = 0; right < n ; right++) {

            freq.put( fruits[right] , freq.getOrDefault(fruits[right], 0) + 1);

            // shrink logic 
            while( freq.size() > 2){
                int fruitLeft = fruits[left];

                freq.put( fruitLeft, freq.get(fruitLeft) - 1);

                if( freq.get(fruitLeft) == 0){
                    freq.remove(fruitLeft);
                }
                left++;
            }

            max = Math.max( max, right - left + 1);

        }


        return max;
        
    }
}