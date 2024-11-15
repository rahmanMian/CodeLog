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
