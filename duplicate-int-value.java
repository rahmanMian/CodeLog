import java.util.*;


public class MyClass {
    public static void main(String args[]) {
      int[][] array2D = {
        // 2D array with vals idk whats the scene
       {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24},
       {400, 401, 402,403,404}
     };

      // i made element 0 obv
      int element = 0;
      //to iteratre between array
      for(int i = 0; i < array2D.length; i++){
         for( int j =0; j < array2D[i].length; j++){
            // get value
             element = array2D[i][j];
             //set ffalg
             boolean flag = false;
             //make element into tring
             String Str = Integer.toString(element); 
         //loop trhough every value
         Set<Character> digitSet = new HashSet<>(); //use set to store values indivually 
          for (char digit : Str.toCharArray()) {
        //if the value has a dup in it it flase eg 404
          if (!digitSet.add(digit)) {
          flag = true;
          break;
          }
        }
        // then print g
        if(flag == true){
           System.out.println(array2D[i][j]);
        }
         }
      }
    
    }
}


