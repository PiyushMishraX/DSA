class Solution {
    public int maxNumberOfBalloons(String text) {
        // // the maximum instance is equal to the letter iteration which is minimum

        // HashMap<Character, Integer> available = new HashMap<>();
        // int n = text.length();

        // for(int i = 0 ; i < n; i++ ){
        //     available.put(text.charAt(i), available.getOrDefault( text.charAt(i), 0) + 1);
        // }

        // HashMap<Character, Integer> need = new HashMap<>();
        // need.put('b', 1);
        // need.put('a', 1);
        // need.put('l', 2);
        // need.put('o', 2);
        // need.put('n', 1);

        // int res = Integer.MAX_VALUE;

        // for( Character key : need.keySet()){

        //     if( !available.containsKey(key))
        //      return 0;

        //     int times = (available.get(key) / need.get(key) );
        //     res = Math.min(res,times );
        // }

        // return res;



        // using array and frequency
        // lowercase only
        int[] freq = new int[26]; // default 0

        // for(int i = 0; i < text.length(); i++){
        //     freq[text.charAt(i) - 'a']++;
        for (char ch: text.toCharArray()) { // faster use this
            freq[ch-'a']++;
        }

        freq['l' - 'a'] /= 2;
        freq['o' - 'a'] /= 2;

        int min = Integer.MAX_VALUE;

        for(char ch : "balon".toCharArray()){
            min = Math.min(min, freq[ch - 'a']);
        }

        return min;
    }
}