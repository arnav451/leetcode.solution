class Solution {
    int [][]dp=new int[1001][1001];
    int fun(int i,int j,String s1,String s2){
        if(i>=s1.length()&&j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i>=s1.length()){
          return dp[i][j]= (int)(s2.charAt(j))+fun(i,j+1,s1,s2);
        }
        if(j>=s2.length()){
            return dp[i][j]= (int)(s1.charAt(i))+fun(i+1,j,s1,s2);
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= fun(i+1,j+1,s1,s2);
        }
        int a=(int)(s1.charAt(i))+fun(i+1,j,s1,s2);
        int b=(int)(s2.charAt(j))+fun(i,j+1,s1,s2);
        return dp[i][j]= Math.min(a,b);
    }
    public int minimumDeleteSum(String s1, String s2) {
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
       return fun(0,0,s1,s2);
    }
}