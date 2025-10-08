//optimal add row and col dupr 
// row/3 and col/3 will put these in sub boxes
//each row should be unqiue for that row. each col should we unique for that col, each sub box is unique. They all are categorized and groupd into 3.
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //NO HASH IN THIS
        Set<String> seen = new HashSet<>();


        for(int row = 0; row < 9; row++){
         for(int col = 0; col < 9; col++){
              char value = board[row][col];
              if(value !=  '.'){
             //NEED TO ADD A STRING IN +
              if (!seen.add(value + "r" + row) || !seen.add(value + "c" + col) || !seen.add(value + "b" + row/3 + col/3)){
                return false;
              }
              }
         }
        }
        return true;
    }
}


// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         //9 x 9 board
//         // each role must be unique 1 - 9
//             // each col must be unique 1 - 9
//                 // each of the nine 3 x 3 subboxes show be unique   
//         //lets loop through row by row and track the state of the col and the boxes as well
//         //how? we use a hashset with 'r' + row number + number for row tracking
//         // 'c' + col number + number for col tracking
//         // 'b' + box number / 3  + number + box trackign 
//         HashSet<String> set = new HashSet<>();
//         for(int i = 0; i <  board.length; i++ ){
//             for(int j = 0; j < board[0].length; j++){
//                char c = board[i][j];
                    //&& needs brackets
//                if(c != '.' &&  (!set.add("r" + board[i][j] +  i) || !set.add("c" + board[i][j] + j) ||  !set.add("b" + board[i][j] + i /3 + j/3))){
//                 return false;
//                }
//             }
//         }
//         return true;
// }
// }
// Brute Force shouldve used a hashset indeset
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         //no dup rows
//         // no dup cols
//         //each 3x3 no dups
//         Map<Character, Integer> hashMap = new HashMap<>();

        
//          for (int row = 0; row < board.length; row++) { // Fixed the iteration over rows
//             hashMap.clear(); // Clear the map for each row
//             for (int col = 0; col < board[row].length; col++) { // Iterate over columns in the row
//                 char value = board[row][col];
//                 if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the row
//                     }
//                 }
//             }
//         }

//           for (int col = 0; col < board[0].length; col++) { // Fixed the iteration over columns
//             hashMap.clear(); // Clear the map for each column
//             for (int row = 0; row < board.length; row++) { // Iterate over rows in the column
//                 char value = board[row][col];
//                 if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the column
//                     }
//                 }
//             }
//            }

//          for (int boxRow = 0; boxRow < board.length;boxRow+= 3) { 
//             for(int boxCol = 0; boxCol < board[0].length;boxCol+=3){
//                   hashMap.clear();
//                 for (int row = boxRow; row < boxRow + 3; row++) {
//                     for (int col = boxCol; col < boxCol + 3; col++) {
//                         char value = board[row][col];
//                         if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the column
//                     }
//                     }
//                     }
                    
//                 }
//             }
//         }

//         return true;
//     }

// }

