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

  public int[] twoSum(int[] nums, int target) {
        
       Map<Integer, Integer> map = new HashMap<>();


       for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            // its put not add
            map.put(nums[i], i);
       }

       return new int[]{};
    }

}
