/*
INCREASING IS KEY WORD FOR BINARY SEARCH
THIS IS A ODD QUESTION WITH A LOT OF SYNTAX. COME BACK TO THIS OFTEN IA.


YOU HAVE TO MAKE YOUR OWN DS. BASCILLY HASHMAP WITH THE VALUE BEING A ARRAYLIST WITH <String, Int>

 map.put(key, new ArrayList<>()); // putting hashmap in first tiem
map.get(key).add(new Data(value, timestamp)); //geting key adding new value



V V V V IMP UNDERSTAND THIS. 
    private HashMap<String, List<Data>> map;

    class Data{
        String value;
        int timestamp;

        public Data(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }






*/




class TimeMap {

    private HashMap<String, List<Data>> map;

    class Data{
        String value;
        int timestamp;

        public Data(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!this.map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {

        if(!this.map.containsKey(key)){
            return "";
        }

        List<Data> data = map.get(key); 
        String value = findClosestValue(data, timestamp);

        return value;
    }

    public String findClosestValue(List<Data> data, int timestamp){
        int left = 0;
        int right = data.size() - 1;
        String value = "";

        //TO CHECK LAST VALUE
        while(left <= right){
            int middle = (left + right) / 2;

            if(data.get(middle).timestamp == timestamp){
                return data.get(middle).value;
            }

            if(data.get(middle).timestamp < timestamp){
                value = data.get(middle).value;
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }

        return value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
