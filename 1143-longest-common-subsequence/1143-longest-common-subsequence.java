class Solution {
    int[][]dp=new int[1001][1001];
    int fun(int i,int j,String text1,String text2){
        if(i>=text1.length()||j>=text2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1+fun(i+1,j+1,text1,text2);
        }else{
            int a=fun(i,j+1,text1,text2);
            int b=fun(i+1,j,text1,text2);
            return dp[i][j]= Math.max(a,b);
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[]row:dp){
            Arrays.fill(row,-1);        }
        return fun(0,0,text1,text2);
    }
}