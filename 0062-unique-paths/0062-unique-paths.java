class Solution {
    int dp[][]=new int[101][101];
    int fun(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i<0||i>m||j<0||j>n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=fun(i+1,j,m,n);
        int left=fun(i,j+1,m,n);
        return dp[i][j]=right+left;
    }
    public int uniquePaths(int m, int n) {
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return fun(0,0,m,n);
    }
}
