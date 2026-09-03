class Solution {
    int fun(int []arr,int idx,int target,int[][]dp){
        if(target==0){
            return 0;
        }
        if(0>target||idx>=arr.length){
            return Integer.MAX_VALUE;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }
     int c1=fun(arr,idx,target-arr[idx],dp);
      if (c1 != Integer.MAX_VALUE) {
            c1 = c1 + 1;
        }
     int c2=fun(arr,idx+1,target,dp); 
     return dp[idx][target]= Math.min(c1,c2);   
    
    }
    public int coinChange(int[] coins, int amount) {
       int[][] dp=new int[coins.length+1][amount+1];
       for(int[] row:dp){
        Arrays.fill(row,-1);
        }
      int ans= fun(coins,0,amount,dp);
      return ans==Integer.MAX_VALUE?-1:ans;
  }
}