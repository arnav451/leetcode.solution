class Solution {
    int [][][]dp=new int [101][101][101];
    boolean fun(int i,int j,char[][]grid,int var){
        int m=grid.length;
        int n=grid[0].length;
        boolean down=false;
        boolean right=false;
        if(i>=m||j>=n){
            return false;
        }
        if(grid[i][j]=='(') var++;
        if(grid[i][j]==')') var--;
         if(var < 0 || var >= 101) {
            return false;
        }
        if(dp[i][j][var]!=-1){
            return  dp[i][j][var]==1;
        }
        if(i==m-1&&j==n-1) return var==0;
        if(i+1<m){
         down= fun(i+1,j,grid,var);
        }
        if(j+1<n){
         right=fun(i,j+1,grid,var);
         }
      if(down||right){
        dp[i][j][var]=1;
      }else{
        dp[i][j][var]=0;
      }
      return down||right;
     }
    public boolean hasValidPath(char[][] grid) {
        for(int[][]row:dp){
            for(int[]col:row){
            Arrays.fill(col,-1);
        }
        }
        return fun(0,0,grid,0);
    }
}