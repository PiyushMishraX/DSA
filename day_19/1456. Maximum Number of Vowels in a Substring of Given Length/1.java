class Solution {
    public int maxVowels(String s, int k) {


        int vowels = 0;

        for (int i = 0; i < k; i++) {

            // sum += nums[i];
            if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                vowels++;
            }
        }

        int max = vowels;
        for (int high = k; high < s.length(); high++) {
            if( s.charAt(high - k) == 'a' || s.charAt(high - k) == 'e' || s.charAt(high - k) == 'i' || s.charAt(high - k) == 'o' || s.charAt(high - k) == 'u' ){
                vowels--;
            }
            if( s.charAt(high) == 'a' || s.charAt(high) == 'e' || s.charAt(high) == 'i' || s.charAt(high) == 'o' || s.charAt(high) == 'u' ){
                vowels++;
            }

            max = Math.max(max, vowels);
        }
        return max;
        
        
    }
}