class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //helps avoiding dups
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i+1]){continue;}//avoid dups for first value

            int start = i + 1;
            int end = nums.length - 1;
            int sum = nums[i] + nums[start] + nums[end];
            while(start < end){

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                
                while(start < end && nums[start] == nums[start + 1]){ //avoiding dups for start pointer
                    start++; 
                }
                while(end > start && nums[end] == nums[end - 1]){//avoiding dups for end pointer
                    end--;
                }

                start++;
                end--;
                }
            }else if(sum < 0){//since sorter we do this
                start++;
            }else{
                end--;
            }
        }     
        return list;       
                
    }
}
