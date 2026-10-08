class Solution {
    int fun(int[][] grid,int i,int j){
         int m=grid.length;
         int n=grid[0].length;
        if(i<0||i>=m||j<0||j>=n){
            return 1;
        }
        if(grid[i][j]==0){
            return 1;
        }
        if(grid[i][j]==-1){
            return 0;
        }
        grid[i][j]=-1;
        int a=fun(grid,i+1,j);
        int b=fun(grid,i-1,j);
        int c=fun(grid,i,j+1);
        int d=fun(grid,i,j-1);
        return a+b+c+d;
    }
    public int islandPerimeter(int[][] grid) {
       int m=grid.length;
         int n=grid[0].length;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
         if(grid[i][j]==1){
      return fun(grid,i,j) ; 
    }
}
         }
         return 0;
    }
}