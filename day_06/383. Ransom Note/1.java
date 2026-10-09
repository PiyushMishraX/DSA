class Solution {

    // boolean func( Map<Character, Integer> need, HashMap<Character, Integer> available) {
    //     for( Character key: need.keySet()){
    //         if( !available.containsKey(key)){
    //             return false;
    //         }

    //         // if( available.get(key) >= need.get(key))
    //         if( available.get(key) < need.get(key))
    //             return false;
    //     }

    //     return true;
    // }
    // public boolean canConstruct(String ransomNote, String magazine) {

    //     HashMap<Character, Integer> need = new HashMap<>();
    //     HashMap<Character, Integer> available = new HashMap<>();
        
    //     for(int i =0; i < ransomNote.length(); i++){
    //         need.put( ransomNote.charAt(i), need.getOrDefault(ransomNote.charAt(i), 0) + 1);
    //     }

    //     for(int i =0; i < magazine.length(); i++){
    //         available.put( magazine.charAt(i), available.getOrDefault(magazine.charAt(i), 0) + 1);
    //     }

    //     return func(need, available);





    public boolean canConstruct(String ransomNote, String magazine) {


        if(ransomNote.length() > magazine.length() ) return false;

        int[] arr = new int[26];

        for(char c: ransomNote.toCharArray()){
           int  ind = magazine.indexOf(c , arr[c - 'a']);

           if( ind == -1) return false;

           arr[c - 'a'] = ind +1;
        }

        return true;


    }
}