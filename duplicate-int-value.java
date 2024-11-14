import java.util.*;


public class MyClass {
    public static void main(String args[]) {
      int[][] array2D = {
    {1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24},
    {400, 401, 402,403,404},
};
      int element = 0;
      for(int i = 0; i < array2D.length; i++){
         for( int j =0; j < array2D[i].length; j++){
             
             element = array2D[i][j];
             boolean flag = false;;
         String Str = Integer.toString(element); 
         
         Set<Character> digitSet = new HashSet<>(); //use set to store values indivually 
          for (char digit : Str.toCharArray()) {
          if (!digitSet.add(digit)) {
          flag = true;
          break;
          }
        }
        
        if(flag == true){
           System.out.println(array2D[i][j]);
        }
         }
      }
    
    }
}


