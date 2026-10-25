import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if( n == 0 ) return 0;

        int low = 0;
        // int max = INT_MIN; 
        int max = 0; 

        HashMap<Character, Integer> freq = new HashMap<>();

        for( int high = 0; high < n ; high++) {

           char c = s.charAt(high);

           if( freq.containsKey(c)){
            low = Math.max( low, freq.get(c) +1 );
           }

           freq.put(c, high);

            max = Math.max( max, high - low + 1);

        }


        return max;
        
    }
}