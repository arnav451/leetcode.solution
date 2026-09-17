class Solution {
     int [][]dp=new int[1001][1001];
    int fun(int i,int j,String s,String t){
        if(i>=s.length() || j>=t.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
            if(s.charAt(i)==t.charAt(j)){
                return dp[i][j]=1+fun(i+1,j+1,s,t);
            }else{
                int c1=fun(i+1,j,s,t);
                int c2=fun(i,j+1,s,t);
               return dp[i][j]= Math.max(c1,c2);
            }   
        }
    public int longestPalindromeSubseq(String s) {
     for(int[]row:dp){
        Arrays.fill(row,-1);
        }
        String reversed = new StringBuilder(s).reverse().toString();
        return fun(0,0,s,reversed);
    }
}