import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length(), n2 = s2.length();
        
        if (n1 > n2) return false;

        int[] s1cnt = new int[26]; // count of lowercase letters
        int[] s2cnt = new int[26];
        

        for (int i = 0; i < n1; i++) {

            s1cnt[ s1.charAt(i) - 'a' ]++;
            s2cnt[ s2.charAt(i) - 'a' ]++;

        }

        for ( int i = 0; i < n2 - n1 ; i++ ){

            if ( Arrays.equals(s1cnt, s2cnt) ) return true;

            s2cnt[s2.charAt(i) - 'a']--;
            
            s2cnt[s2.charAt(i + n1) - 'a']++;
        }

        return Arrays.equals(s1cnt, s2cnt);
        
    }
}