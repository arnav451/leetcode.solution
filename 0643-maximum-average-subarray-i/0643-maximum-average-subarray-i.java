class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int left=0; int right=0; int sum=0; int maxsum=Integer.MIN_VALUE;
     while(right<nums.length){
        sum=sum+nums[right];
 
    if(right-left+1>k){
      sum=sum-nums[left];
      left++;
    }
    if(right-left+1==k){
        maxsum=Math.max(sum,maxsum);
    }
    right++;
     }
    return (double) maxsum/k;
    }
}