/*
  WHENEVER YOU SEE O(LOGN) THINK OF BINARY SEARCH
  INITUITION HERE IS STICK TO THE RIGHT AS IF MID VAL > VAL ON RIGHT THE OTHER VALUES LOOPED AROUND ARE GOING TO BE GREATER ANYWAY SO WE 
  MOVE LEFT MIDDLLE + 1 AS WE KNOW MIDDLE IS GREATER THAN RIGHT. 

  NOW IF THE VALUE IS LOCATED ON THE LEFT MEANING MIDDLE IS LESS THAN RIGHT MOVE RIGHT POITNER TO MIDDLE VALUE TO EXACT MIDDLE AS THAT COULD BE THE SMALLEST VALUE
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
