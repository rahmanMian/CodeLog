//Two pointer approach, Math.min is cool

class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxWater = 0;
        int water = 0;

        while(start < end){
            water = Math.min(heights[start], heights[end]) * (end - start);

            maxWater = Math.max(water, maxWater);

            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }

        return maxWater;
    }
}
