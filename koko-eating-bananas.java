/*
  Binary search
  we need to test every hour with every value to see if the total hours is less than h
  Math.ceil((double) p / k) imp as it takes a doublle in only

   Arrays.stream(piles).max().getAsInt(); NOT NEED CAN JUST SIMPLY LOOP TRHOUGH


*/


public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;


        while(left <= right){
            int k = (left + right) / 2;

            int hoursTaken = 0;
            for(int pile: piles){
                hoursTaken += Math.ceil((double) pile / k);
            }

            //use binary serach
            if(hoursTaken <= h){
                right = k - 1;
                result = k;
            }else{
                left = k + 1;
            }
        }

        return result;
    }
}
