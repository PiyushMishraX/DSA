/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

  class GuessGame {
    public int guess(int num){


        int hint = 0; // 1,2 , 2
        return hint;
    }
 }

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int low = 1;
        int high = n;

        while( low <= high){

            int mid = low + ( high - low)/2;

            int guess = guess(mid);

            if( guess == 0){
                return mid;
            }

            if( guess == 1){
                low = mid + 1;
            } else{ // -1
                high = mid - 1;
            }
        }

        return 1;
        
    }
}