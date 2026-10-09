class Solution {

    // faster using static keyword

    // static {
    //     for(int i = 0; i < 1000; i++) {
    //         boolean abc = isAnagram("", "a");
    //     }
    // }

    // public static boolean isAnagram(String s, String t) {



    public boolean isAnagram(String s, String t) {


        // array frequency method --> 
        // for when the anagram only have lower case letter
        // the the ascii numbers can work as indexes for lower case letters
        // in a 26 length array


        if( s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // a zero equivalen always initialized in array

        for(int i = 0; i < s.length(); i ++){

            count[s.charAt(i) - 'a']++; // char at -> 'a' - 'a' -> 97 - 97 -> 0
            count[t.charAt(i) - 'a']--;
        }

        for(int num: count){
            if(num != 0){
                return false; // the ++ , -- cancels each other for anagram all values would be 0
            }
        }

        return true;
    }
}