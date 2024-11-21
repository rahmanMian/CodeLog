class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();    

        for(int num: nums){
            set.add(num);
        }

        int max = 0;
        for(int num : set){
            //new syntax
            if(set.contains(num+1)){continue;}
            int count = 1;
             while(set.contains(num-count)){
                 count++;
             }

          max = Math.max(count , max);

        }
    
    
        return max;
    }
}

//mysol but arrays.sort(nums) janky

class Solution {
    public int longestConsecutive(int[] nums) {
        //nums.sort() if its a array list
        Arrays.sort(nums);
        int maxSeq = 1;
        int sequenceCount = 1;

        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] == nums[i+1]){
                 continue; 
            }
            if (nums[i] == nums[i + 1] - 1){
                sequenceCount++;
            }else {
                sequenceCount = 1;
            }

            maxSeq = Math.max(maxSeq, sequenceCount);
        }

    return maxSeq;
    }
}
