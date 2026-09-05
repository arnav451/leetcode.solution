class Solution {
   int fun(int i,int[] nums ,int[]dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!= -1){
            return dp[i];
        }
        int a=nums[i]+fun(i+2,nums,dp);
        int b=fun(i+1,nums,dp);
         return dp[i] = Math.max(a,b);
    }
    public int rob(int[] nums) {
        int n=401;
        int []dp=new int[n];
        Arrays.fill(dp, -1);
       return fun(0,nums,dp);
    }
}