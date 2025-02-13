/*
  Binary search
  we need to test every hour with every value to see if the total hours is less than h
  Math.ceil((double) p / k) imp as it takes a doublle in only OR (num + (othernum - 1) / othernum) also works

   Arrays.stream(piles).max().getAsInt(); NOT NEED CAN JUST SIMPLY LOOP TRHOUGH


*/


public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 0;
       int right = 0;
       int k = 0;

       for(int pile: piles){
          right = Math.max(pile, right);
       }

       while(left <= right){
        int middle = (left + right) / 2;
        int hoursTaken = 0;
       

        for(int pile: piles){
            hoursTaken += Math.ceil((double) pile / middle);   // pile + (pile + middle - 1) / middle
        }

        if(hoursTaken <= h){
            k = middle;
            right = middle - 1;
        }else{
            left = middle + 1;
        }
       }

       return k;

    }
}
