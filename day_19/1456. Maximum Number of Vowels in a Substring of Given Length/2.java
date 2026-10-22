class Solution {

    
    public int maxVowels(String s, int k) {

        int len = s.length();

        if( len == 0) return 0;

        char[] str = s.toCharArray();

        int[] isVowel = new int[123]; // 'z' == 122
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = 1;

        int vowels = 0;

        for (int i = 0; i < k; i++) {

            vowels += isVowel[str[i]];
        }

        int max = vowels;

        for (int high = k; high < s.length(); high++) {
            
            vowels = vowels + isVowel[str[high]] - isVowel[str[high - k]];

            max = Math.max(max, vowels);
        }
        return max;
        
        
    }
}