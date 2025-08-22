class Solution {
    public int longestConsecutive(int[] nums) {
        // 2 20 4 10 3 4 5
        // 2,3,4,5 10 20
        //logic first add into set and group
        //then for each group go to largest by checkig if there is a greater value
        //reverse the serch use a while loop and counter to see how deep it goes
        //Math.maxt to see the largest seq
        //O(n) the solution technique is INSTEAD OF CHECKIGN FIRST REACH A POINT WHERE THERE IS NO GREATED VALUE THEN CHECK TO AVOID PRIOR REDUNDANT CHECKS
        //What's a redundant check? 
        //   Start at 1: finds 2, 3, 4 → count = 4 ✅
        //   Start at 2: finds 3, 4 → count = 3 ❌ (already counted)
        //   Start at 3: finds 4 → count = 2 ❌
        //   Start at 4: no 5 → count = 1 ❌
        //   Start at 100: no 101 → count = 1
        //   Start at 200: no 201 → count = 1

        Set<Integer> set = new HashSet<>();
        

        for(int num: nums){
            set.add(num);
        }

        int max = 1;
        for(int i = 0; i < nums.length; i++){
            //this is the line that makes it O(n) as  we only run while loop at  end of sequence for worst O(n) so O(2n)
            if(set.contains(nums[i] + 1)){continue;}
            int count = 1;
            while(set.contains(nums[i] - count)){
                count++;
            }

            max = Math.max(count, max);
        }

        return max;

    }

//mysol but arrays.sort(nums) janky its faster tho
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
