class Solution {
    int [][]dp=new int[101][101];
    int fun(int i,int j,int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
     if(i>=m||j>=m||i<0||j<0) {
        return Integer.MAX_VALUE;
     }
     if(dp[i][j]!=-10001){
        return dp[i][j];
     }
     if(i==m-1){
        return matrix[i][j];
     }
      int a=fun(i+1,j,matrix);
      int b=fun(i+1,j+1,matrix); 
      int c=fun(i+1,j-1,matrix);
      return dp[i][j]=matrix[i][j]+Math.min(Math.min(a,b),c);
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
    int m=matrix[0].length;
    for(int [] row:dp){
        Arrays.fill(row,-10001);
    }
        int ans=Integer.MAX_VALUE;
       for(int i=0;i<matrix.length;i++){
        ans=Math.min(ans,fun(0,i,matrix));
        
       } 
       return ans;
    }
}