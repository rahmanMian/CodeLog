// set up hashmap and loop through array with no of occurences 
// make array nlist which stores int[] 
//loop through map using for each 
//add array in array list using key, value 
//array list sort from high to low 
//make array of size k 
//loop and add first k values

 Map<Integer, Integer> count = new HashMap<>();
        // loop through array and set up hashmap with no of occurences
        for(int num: nums){
            //REMEMEBER PUT               //KEEP NUM FIRST ORDER IMP
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        // make array nlist which stores int[]
        List<int[]> arr = new ArrayList<>();
        // loop through map using for each
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            //add arry in array list using key, value
            arr.add(new int[] {entry.getKey(), entry.getValue()});
        }

        //THIS LOOS AT TWO ARRAYS AND SORTS FROM SECOND VALUE FROM DESCENDING
        arr.sort((a, b) -> b[1] - a[1]);

        //make array of size k 
        int[] res = new int[k];
        //loop and add first k values
        for (int i = 0; i < k; i++) {
                      //REMMEBER ARRAYLIST SYNTAX
            res[i] = arr.get(i)[0];
        }
        return res;
