class Solution {
    int [][]dp;
    int fun(int [] arr,int i,int prev,int k,int max){
        if(i>=arr.length){
            return 0;
        }
        int len=i-prev+1;
        if(dp[i][prev]!=-1){
            return dp[i][prev];
        }
         max=Math.max(max,arr[i]);
         int ans=0;
        if(len==k){
           int a=max*len+fun(arr,i+1,i+1,k,0); 
           ans=Math.max(ans,a);
        }else{
        int a=max*len+fun(arr,i+1,i+1,k,0);
        int b=fun(arr,i+1,prev,k,max);
        ans=Math.max(ans,a);
        ans=Math.max(ans,b);
    }
        return dp[i][prev]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
       dp=new int[501][501];
       for(int[]row:dp)
       Arrays.fill(row,-1); 
       return fun(arr,0,0,k,0);
    }
}