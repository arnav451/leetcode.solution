class Solution {
    int [][]dp=new int[501][501];
    int fun(int i,int[] nums,int k,int curr){
        if(i>nums.length){
            return 0;
        }
        if(dp[i][curr]!=-1){
            return dp[i][curr];
        }
        int take=1;
        int ans=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                ans=Math.max(ans,fun(j,nums,k,curr));
            }else if(curr<k){
                ans=Math.max(ans,fun(j,nums,k,curr+1));
            }
           // take +=ans;
        }
         return dp[i][curr]=1+ans;
    }
    public int maximumLength(int[] nums, int k) {
        int ans=0;
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,fun(i,nums,k,0));
        }
        return ans;
    }
}