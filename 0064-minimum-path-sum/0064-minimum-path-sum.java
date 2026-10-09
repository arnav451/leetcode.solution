class Solution {
    int [][]dp=new int[201][201];
    int fun(int i,int j,int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m||j>=n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1 && j==n-1)return grid[i][j];
        int a=fun(i+1,j,grid);
        int b=fun(i,j+1,grid);
        return dp[i][j]=grid[i][j]+Math.min(a,b);
    }
    public int minPathSum(int[][] grid) {
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
       return fun(0,0,grid); 
    }
}