class Solution {
    int [][]dp=new int[2501][2501];
    int fun(int i,int p,int[]nums){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][p+1]!=-1){
            return dp[i][p+1];
        }
        int b=fun(i+1,p,nums);
        int a=0;
            if(p==-1||nums[i]>nums[p]){
             a=1+fun(i+1,i,nums);
            }
       return dp[i][p+1] = Math.max(a,b);
    }
    public int lengthOfLIS(int[] nums) {
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return fun(0,-1,nums);
    }
}