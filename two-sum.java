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



//HashMap O(1) lookup time so we run this in O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

}
