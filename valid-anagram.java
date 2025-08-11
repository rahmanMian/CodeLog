
//*great sol i did wiht hashmap but was wayyyy slower stick to sthis
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26]; //26 characters in alphabet


        for(int i = 0; i < s.length(); i++){

            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;

            // 'a' - 'a' = 0
            // 'b' - 'a' = 1
            // 'z' - 'a' = 25
        }


        for(int val: arr){
            if(val != 0){
                return false;
            }
        }

        return true;


    }
}


//thos was my hashmap sol

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

         Map<Character, Integer> sMap = new HashMap<>();
         Map<Character, Integer> tMap = new HashMap<>();

        //use put instead
         for(int  i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1); 
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1); 

         }

         return sMap.equals(tMap);
         

    }
}
