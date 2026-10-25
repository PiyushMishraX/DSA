class Solution {

    int findmax( int[] arr ) {

        int max = -1;

        // for( int i = 0; i < 256; i++) // uppercase only 
        for( int i = 0; i < 26; i++)
            max = Math.max(max , arr[i]);

        return max;

    }
    public int characterReplacement(String s, int k) {

        int n = s.length();
        int low = 0, max = 0;

        int[] freq = new int[26];

        for( int high = 0; high < n; high++){
            freq[s.charAt(high) - 'A']++;

            int len = high - low + 1;
            int maxcount = findmax(freq);
            int diff = len - maxcount;

            while(diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
                maxcount = findmax(freq);

                len = high -low +1;
                diff = len - maxcount;
            }

            len = high - low + 1;
            max = Math.max( max, len);          
            
        }

        return max;


        
    }
}