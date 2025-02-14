/*
Binary Search here
Keep your binary search logic strong and think about the solution. This question isn't hard. Once again O(logN)
REMEMEBER THE YOU CAN ONLY BINARY SEARCH ON SORTED SIDES
We choose by which side is sorted first then check if target is present in it



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


            //<= BECAUSE THEY CAN OVERLAP WHEN VALUES ARE LESS
            if(nums[left] <= nums[middle]){ //left side is sorted

                if(nums[left] <= target && target < nums[middle]){ // if target is on left side
                    right = middle - 1;
                }else{
                    left = middle + 1; //target is not on left side
                }
            }else{ //right side is sorted
                 if(nums[right] >= target && target > nums[middle]){ //target on right side
                    left = middle + 1; 
                }else{
                    right = middle - 1; //target not on right side
                }
            }
        }
        return -1;
}
}
