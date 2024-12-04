import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap();

        for(int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i])){
                return new int []{hashMap.get(target - nums[i]), i};
            }
            //hash map has put not add
            hashMap.put(nums[i], i);
        }
      
       
  
          return null;
} 
}
