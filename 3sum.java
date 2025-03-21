//MAKE A VISUAL SOL HERE FOR FUTURE


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            //makes check for dups writ ethe way this visually workds
            if(i > 0 && nums[i] == nums[i-1]){continue;}

            int start = i + 1;
            int end = nums.length - 1;
           
            while(start < end){
                 int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                
                while(start < end && nums[start] == nums[start + 1]){
                    start++;
                }
                while(end > start && nums[end] == nums[end - 1]){
                    end--;
                }
                start++;
                end--;
                //if less tahn zero bring in larger num
            }else if(sum < 0){
                start++;
            }else{
                end--;
            }
        }     
        
                
    }
      return list;     

    }
}
