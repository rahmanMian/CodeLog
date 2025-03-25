/*
Only check adjacent we have dsitnc valeues if equal to min that means move on as other values have to be greated since we sorted it


O(N * LOG N) for sorting and one loop
*/


class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;


          for (int i = 0; i < arr.length - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

     
         for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
}
