// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//need help finding a good working solution
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        System.out.println(vowelSubString("aaeiouax"));
        
        
    }
    
    /*
    BRUTE FORCE AND INEFFICIENT
    USING A STRING AS LOOK UP IS O(N) use a hashset instead
    USING TWO FOR LOOP IS O(N^2)
    I CREATE A NEW HASHMAP EVERY TIME WHICH IS BAD






  */
    
    public static long vowelSubString(String s){
        
    
     
        String vowels = "aeiou";
        long count = 0;
        
        
        for(int i = 0; i < s.length(); i++){
               Map<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                
                if(!vowels.contains(String.valueOf(c))){
                    break;
                }
                
                map.put(c, map.getOrDefault(c, 0) + 1);
                
                if(map.size() == 5){
                    count++;
                }
            }
        }
        

        return  count;
    }
}
