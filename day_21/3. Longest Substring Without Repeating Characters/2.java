import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if( n == 0 ) return 0;

        int low = 0, max = 0;

        HashMap<Character, Integer> freq = new HashMap<>();

        for( int high = 0; high < n; high++ ){

            char c = s.charAt(high);

            freq.put( c, freq.getOrDefault( c, 0) + 1 );

            int k = high - low + 1;

            while( freq.size() < k ){

                // freq.computeIfPresent(c, (key, val) -> val > 1 ? val - 1 : null);

                freq.put( s.charAt(low) , freq.getOrDefault( s.charAt(low) , 0) - 1); // low is present always 

                if( freq.get( s.charAt(low)) == 0)
                    freq.remove( s.charAt(low));

                low++;

                k = high - low + 1;

            }

            max = Math.max( max, high - low + 1);
        }

        return max;
        
    }
}