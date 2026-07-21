class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j] == word.charAt(0) && find(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board , int i , int j , int idx , String word ){
        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
     if(idx == word.length()){
        return true;
     }
     if( i < 0 || j < 0 || i >= board.length || j >= board[0].length){
        return false;
     }
     if(board[i][j] != word.charAt(idx)){
        return false;
     }
     char temp = board[i][j];
     board[i][j] = '$';

     for(int d = 0; d<directions.length; d++){
        int new_i = i + directions[d][0];
        int new_j = j + directions[d][1];

        if(find(board , new_i , new_j , idx+1 , word)){
            return true;
        }
     }
     board[i][j] = temp;

     return false;
 }
}