/*
Binary search very optimal for sorter in ascending order - O(N)
left <= right is important if the value is on the edge / only value to begin with
remeber the edge
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;;


        while(left <= right){
             mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
