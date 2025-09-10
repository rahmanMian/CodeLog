//NEVER EAEVR USE THIS SOL THIS WAS GOOD PRACTICE -  list.get(i).set(1, value);  HOW TO SET A NEW ARRAY LSIT VALUE

class MyHashMap {

    private List<List<Integer>> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean found = false;
        for(int i = list.size() - 1; i >= 0; i--){
             if(list.get(i).get(0) == key){
                list.get(i).set(1, value); 
                  found = true;
                break;
             } 
           }
       if (!found) {
        list.add(new ArrayList<>(Arrays.asList(key, value)));
    }
    }
    
    public int get(int key) {
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i).get(0) == key){
                return list.get(i).get(1);
            }
        }
        return -1;
    }  
    
    
    public void remove(int key) {
         for(int i = 0; i < list.size(); i++){
            if(list.get(i).get(0) == key){
                list.remove(i);
                break;
            }
        }
    }

}

//really mad mem but sick sol - what is another way?
class MyHashMap {
    private int[] map;
    public MyHashMap() {
        map = new int[10000001];
        Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}

