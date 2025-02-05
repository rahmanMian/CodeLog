//YOU NEED TO LEARN HASMAP AND ARRAY LSIT AND HOW TO TRAVERSE THROUGH SEARCH THROUGH

// set up hashmap and loop through array with no of occurences 
// make array nlist which stores int[] 
//loop through map using for each 
//add array in array list using key, value 
//array list sort from high to low 
//make array of size k 
//loop and add first k values


    public int[] topKFrequent(int[] nums, int k) {
        //make a hash map
        Map<Integer, Integer> hashMap = new HashMap<>();

        //loop trhough nums ans store occurences for each number in hashMap
        for(int num: nums){
                    //HASHMAP HAS PUT
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        //make a array list of int[] as we can easily sort this
        List<int[]> arrayList = new ArrayList<>();

        //loop through hashMap entrires and store the key,value pairs as an array in the arrayList
            //SYNTAX FOR LOOPING THROUGH HASHMAP          //E is small
        for(Map.Entry<Integer, Integer> entries : hashMap.entrySet()){
                //ARRAYLIST HAS ADD
            arrayList.add(new int[]{entries.getKey(), entries.getValue()});
        }

        //sort the arrayList in descending order a - b is asceding order
        arrayList.sort((a,b) -> b[1] - a[1]);

        //make an array int of k elements
        int[] kValues = new int[k];

        for(int i = 0; i < k; i++){
                                //ARRAYLIST HAS GET
            kValues[i] = arrayList.get(i)[0];
        }

        return kValues;
    }

