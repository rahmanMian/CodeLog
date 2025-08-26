
//did tdoay but i like this more
//two poitner solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0, right = numbers.length - 1;

       while(l < r){
            int curSum = numbers[left] + numbers[right];

            if (curSum > target){
                right--;
            } else if ( curSum < target) {
                left++;
            }else {
                return new int[] {l + 1, r + 1};
            }
       }
       return new int[0]; //return null works here too
    }
}



//brute force
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) { // Start from i + 1 to avoid duplicate pairs
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }
}
