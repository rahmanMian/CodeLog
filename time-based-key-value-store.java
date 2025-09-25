/*
INCREASING IS KEY WORD FOR BINARY SEARCH
THIS IS A ODD QUESTION WITH A LOT OF SYNTAX. COME BACK TO THIS OFTEN IA.


YOU HAVE TO MAKE YOUR OWN DS. BASCILLY HASHMAP WITH THE VALUE BEING A ARRAYLIST WITH <String, Int>


 map.put(key, new ArrayList<>()); // putting hashmap in first tiem
map.get(key).add(new Data(value, timestamp)); //geting key adding new value


 //why value becaue we want the lowests value befoereleft moves away from range
                value = dataList.get(middle).value;
                left = middle + 1;


Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

Implement the TimeMap class:

TimeMap() Initializes the object of the data structure.
void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 

Example 1:

Input
["TimeMap", "set", "get", "get", "set", "get", "get"]
[[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
Output
[null, null, "bar", "bar", null, "bar2", "bar2"]

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
