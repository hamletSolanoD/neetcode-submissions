/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while(l <= r ){
            int middleNumber = l + (r - l ) / 2;
            int isCorrect = guess(middleNumber);
            if(isCorrect == -1){
                r = middleNumber-1;
            }
            else if(isCorrect == 1){
                l = middleNumber+1;
            }
            else{
                return middleNumber;
            }
        }
        return 0;
        
    }
}