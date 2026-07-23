class Solution {
        int result = 0;
        int nonObstacle = 0;
       
    public int uniquePathsIII(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;
        int start_x = 0; int start_y = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 0)
                    nonObstacle++;

                if(grid[i][j] == 1){
                    start_x = i;
                    start_y = j;
                
                   }
                }
            }
            nonObstacle +=1;
            int count = 0;
            find(grid,count,start_x , start_y);
            return result;
        }
    

    public void find(int[][] grid ,int count , int i , int j  ){
        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        
        if(i < 0 || j < 0 || i >= grid.length || j>=grid[0].length || grid[i][j] == -1){
            return;
        }
        if(grid[i][j] == 2){
           if (count == nonObstacle){
            result++;
        }
         return;
    }
    int original = grid[i][j];
        grid[i][j] = -1;
    for(int d = 0; d<directions.length; d++){
          int  new_i = i + directions[d][0];
           int new_j = j + directions[d][1];
            find(grid,count+1,new_i,new_j);
    }
        grid[i][j] = original;
    }
}