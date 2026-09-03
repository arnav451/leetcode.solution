class Solution {
    static int fun(int []arr,int idx,int sum,int target,int[][]dp){
     if(target==sum){
        return 1;
     }
     if(sum>target || idx>=arr.length){
        return 0;
     }
      if(dp[idx][sum]!=-1){
        return dp[idx][sum];
      }
     int c1=fun(arr,idx,sum+arr[idx],target,dp);
     int c2=fun(arr,idx+1,sum,target,dp);
      dp[idx][sum]=c1+c2;
      return dp[idx][sum];
    }
    public int change(int amount, int[] coins) { 
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1]; 
        
        for (int[] row : dp) { 
            Arrays.fill(row, -1); 
        } 
        
        return fun(coins, 0, 0, amount, dp); 
    } 
}