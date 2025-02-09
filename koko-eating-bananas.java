/*
  Binary search
  we need to test every hour with every value to see if the total hours is less than h
  Math.ceil((double) p / k) imp as it takes a doublle in only

   Arrays.stream(piles).max().getAsInt(); NOT NEED CAN JUST SIMPLY LOOP TRHOUGH


*/


public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        //stroes max value of the mile as an in
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (l + r) / 2;

            int totalTime = 0;
            for (int p : piles) {
                            //needs double and returns double
                totalTime += Math.ceil((double) p / k);
            }
                //USE bianry search to eliminate value
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}
