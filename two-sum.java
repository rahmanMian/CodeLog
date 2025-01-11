import java.util.HashMap;
import java.util.Map;


//my brute force
  public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }

            }
        }
        // new int[]{}; works too
        return null;
    }

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
