/*
my sol
*/
class Solution {
    public int findDuplicate(int[] nums) {
         //just use a hashset bro
        Map<Integer, Integer> map = new HashMap<>();
        

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > 1){
                return num;
            }
        }
        
        return 0;
    }
}
