class Solution {
    int dp[][]=new int[501][501];
    int fun(int i,int j,String word1,String word2){
        if(i>=word1.length()||j>=word2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
        return dp[i][j]= 1+fun(i+1,j+1,word1,word2);
    }
    return dp[i][j]= Math.max(fun(i+1,j,word1,word2),fun(i,j+1,word1,word2));        
    }
    public int minDistance(String word1, String word2) {
     int n=word1.length();
     int m=word2.length();
     for(int []row:dp){
        Arrays.fill(row,-1);
     }
    int lcs = fun(0, 0, word1, word2); 
     return n + m - (2 * lcs);
    }
}