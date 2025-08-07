class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();

       for(int num: nums){
        if(!set.add(num)){return true;}
       }
       return false;
    }
}


// // we back
// //class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();

//         for(int i = 0; i < nums.length; i++){
//             if(!set.add(nums[i])){
//                 return true;
//             }

//         }
//         return false;
//     }
// } 
