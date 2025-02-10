/*
Binary Search here
Keep your binary search logic strong and think about the solution. This question isn't hard. Once again O(logN)




*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[middle] == target){
                return middle;
            }
            
            if(nums[left] <= nums[middle]){ //left side is sorted
                if(target >= nums[left] && target < nums[middle]){ //target is on the left side
                    right = middle - 1; 
                }else{
                    left = middle + 1; //target is on the right of new side
                }
            }else{ //right side sorder
                if(target <= nums[right] && target > nums[middle]){ //target is on the rig htside
                    left = middle + 1; 
                }else{
                    right = middle - 1; //target is on the left of new segment side
                }
            }
        }
        
        return -1;
    }
}
