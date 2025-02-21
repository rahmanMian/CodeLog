/*
BRUTE FORCE - O(N^2)
*/



class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
       
       
    
                        //stop the substring length amount away
        for(int i = 0; i <= s2.length() - s1.length(); i++){
             String sub = s2.substring(i, i + s1.length());
             char[] subArr = sub.toCharArray();
             Arrays.sort(subArr);

             if (Arrays.equals(arr1, subArr)) {
                return true;
            }
        }


        return false;

    }
}

/*
SLiding Window - 0(26 * N)
Move through the window which the the first strings length. make a hashmap of s1 first and then for each window change the increment of s2 from the left and right
new thing for maps
            if (s1Count.equals(s2Count)) {
                return true;
            }
        }
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }
        
        if (s1Count.equals(s2Count)) {
            return true;
        }
        
        int left = 0;
    
        for (int right = s1.length(); right < s2.length(); right++) {

             char charLeft = s2.charAt(left);
            s2Count.put(charLeft, s2Count.get(charLeft) - 1);
            if (s2Count.get(charLeft) == 0) {
                s2Count.remove(charLeft);
            }
            
            left++;
            
            
            char charRight = s2.charAt(right);

            s2Count.put(charRight, s2Count.getOrDefault(charRight, 0) + 1);
            
           
            if (s1Count.equals(s2Count)) {
                return true;
            }
        }
        
        return false;        
    }
}
