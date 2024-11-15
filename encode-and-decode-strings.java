//Make a string builder instance
//loop trhogu  list
//append demiliter to loop
//retrun stringbuilder as string


//make new array list of string
//loop through string
//sent two points between wherefer you see delimties
//user str.substring(pointer 1, pointer 2) to .add to the new array list



class Solution {

    public String encode(List<String> strs) { 
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < strs.size(); i++){
            sb.append("~").append(strs.get(i));
        }
      
        return sb.toString();
    }

  public List<String> decode(String str) {
    List<String> decoded = new ArrayList<>();
   
   int i = 0;
   while(i < str.length()){
      int j = i;
      if(str.charAt(j) == '~'){
        j++;
      }
      i++;
      while( i < str.length() && str.charAt(i) != '~'){
         i++;
      }
     decoded.add(str.substring(j, i));
   }

   return decoded;
}

          
       
    }
