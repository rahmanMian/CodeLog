/*
*hashmap -> getOrDefault
*hashmap you put values into it
*Arraylist had entry
*for(Map.Entry<Integer, Integer> entries : hashMap.entrySet()){
 arrayList.sort((a,b) -> b[1] - a[1]);
kValues[i] = arrayList.get(i)[0];
*/

// set up hashmap and loop through array with no of occurences 
// make array nlist which stores int[] 
//loop through map using for each 
//add array in array list using key, value 
//array list sort from high to low 
//make array of size k 
//loop and add first k values


  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //make a hash map
        Map<Integer, Integer> map = new HashMap<>();


        //populate array
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        //make list of Integer[] as primitive data types are supported, you can do it it iwll work but it just converts at the abcl
        List<Integer[]> list = new ArrayList<>();

        //tricky synstax- all its doing it looping thorugh map and add values in arraylist as we can sort it
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new Integer[]{entry.getKey(), entry.getValue()});
        }

        //sorting in descending order using values
        list.sort((a, b) -> b[1] - a[1]);
        
        //pick the k top values.
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = list.get(i)[0];
        }
        
        return arr;
}
}
