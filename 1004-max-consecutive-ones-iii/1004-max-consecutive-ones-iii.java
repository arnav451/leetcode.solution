class Solution {
    public int longestOnes(int[] nums, int k) {
     int maxLen=0; int left=0; int right=0; int zeroes=0;
     while(right<nums.length){
        if(nums[right]==0){
            zeroes++;
        }
     while(zeroes>k){
        if(nums[left]==0){
            zeroes--;
        }
            left++;
        }
        if(zeroes<=k){
            int len=right-left+1;
            maxLen=Math.max(maxLen,len);
            right++;
        }
     }
     return maxLen ; 
    }
}