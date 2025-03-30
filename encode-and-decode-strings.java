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
        
        for( String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

  public List<String> decode(String str) {
    List<String> decoded = new ArrayList<>();
   
    int i = 0;
    while(i < str.length()){
        int j = i;
        while(str.charAt(j) != '#'){
            j++; //find #
        }
                    //syntax check
        int length = Integer.parseInt(str.substring(i, j));
        i = j + 1;
        j = i + length;
        decoded.add(str.substring(i, j));
        i = j;
    }

    return decoded;
 }
     
}
