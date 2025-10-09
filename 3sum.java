import java.util.Collections;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //array we need to find triplets that are unique and add up to zero
        //Hint: lock one value eg -1
        //apply two sum on other values but target val is -()

        //Make a list of another list
        List<List<Integer>> listOfLists = new ArrayList<>();
        //sort the original array
        Arrays.sort(nums);
        //-2 cuz we have two pointers for checking
        for (int i = 0; i < nums.length - 2; i++) {

            //this is a duplicate check, continue means to skip this iteration this may give a dup value aif not done
            //why -1 cuz we have to let i run once with the og value and move forward. i + 1 is starts postion/
            if (i > 0 && nums[i] == nums[i - 1]) { // Corrected duplicate check for the first element
                continue;
            }

            // way this is set up in ascedning meaning having the same i,start,end values in same position may lead to dups

            //start infront of i
            int start = i + 1;
            //end of arr
            int end = nums.length - 1;

            //may sure they dont overlap
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sum == 0) {
                    listOfLists.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    //dont forget the endcase 
                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    //same edge case here
                    while (end > start && nums[end] == nums[end - 1])
                        end--;
                    //why this? beacuase you fall on the last dup value and we have to move off it
                    start++;
                    end--;

                    // way this is set up in ascedning meaning having the same i,start,end values in same position may lead to dups

                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
            //just return final value
        }
        return listOfLists;
    }
}
