/*
   map.put(sortedString, new ArrayList<>());
   map.get(sortedString).add(strs[i]);
   keep this in mind 
   ArrayList<>(map.values()); map.values() return a collection. meaing [] but mutable. Thats why we can direclty pass it in
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       Map<String, List<String>> map = new HashMap<>();

       for(int i = 0; i < strs.length; i++){
            char[] value = strs[i].toCharArray();
            Arrays.sort(value);
            String sortedString = new String(value);

            if(!map.containsKey(sortedString)){
             
                map.put(sortedString, new ArrayList<>());
            }
                map.get(sortedString).add(strs[i]);
       }


       return new ArrayList<>(map.values());
       
    }
}
