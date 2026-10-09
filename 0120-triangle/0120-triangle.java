class Solution {
    int [][] dp=new int[201][201];
    int fun(int i,int j,List<List<Integer>> triangle){
        int m=triangle.size();
         if(i==m-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int down=fun(i+1,j,triangle);
        int diagDown=fun(i+1,j+1,triangle);
       return dp[i][j]=triangle.get(i).get(j)+Math.min(down,diagDown);
        }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        for(int [] row:dp){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return fun(0,0,triangle);
}
}