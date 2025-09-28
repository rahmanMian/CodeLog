/*
  Binary search
  we need to test every hour with every value to see if the total hours is less than h
  1. Math.ceil((double) p / k) imp as it takes a doublle in only
  2.(num + (othernum - 1) / othernum) also works
  3.int n = pile / middle + ((pile % middle == 0) ? 0 : 1); 

   Arrays.stream(piles).max().getAsInt(); NOT NEED CAN JUST SIMPLY LOOP TRHOUGH
  yo read this

*/


public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 0;
       int right = 0;
       int k = 0;

       // loop through pile and find max pile
       // find max pile  value
       for(int pile: piles){
          right = Math.max(pile, right);
       }



      // use bonary search to make it faster
       while(left <= right){
        int middle = (left + right) / 2;
        int hoursTaken = 0;
       
        // now we test for every k from min 0 to  max right 
        for(int pile: piles){
            hoursTaken += Math.ceil((double) pile / middle);   // pile + (pile + middle - 1) / middle
        }

        // if its less than h make that the middle 
         // test values lower tahn it 
        if(hoursTaken <= h){
            k = middle;
            right = middle - 1;
        }else{
            // if greated we are going to slow move the left one above
            left = middle + 1;
        }
       }

       return k;

    }
}
