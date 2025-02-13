/*
  WHENEVER YOU SEE O(LOGN) THINK OF BINARY SEARCH
  INITUITION HERE IS STICK TO THE RIGHT AS IF MIDVAL > VAL ON RIGHT THE OTHER VALUES LOOPED AROUND ARE GOING TO BE GREATER ANYWAY
  WE CLOSE IN ON THE MIN VALUE SO END THE LOOP AT LEFT == RIGHT
 
  This is what i mean
  if(XXXXXXXXXXXXX){
                left = middle + 1;
            } else{
                right = middle;
            }


*/

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;


        while(left < right){
            middle = (left + right) / 2;

            if(nums[middle] > nums[right]){
                left = middle + 1;
            } else{
                right = middle;
            }
        }

        return nums[left];
    }
}
