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
