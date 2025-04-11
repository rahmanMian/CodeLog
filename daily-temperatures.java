//O(n^2)

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] arr = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1;i++){
            for(int j = i + 1; j < temperatures.length; j++){
                if (temperatures[i] < temperatures[j]){
                    arr[i] = j - i;
                    break;
                }
            }
        }
        return arr;
    }
}
