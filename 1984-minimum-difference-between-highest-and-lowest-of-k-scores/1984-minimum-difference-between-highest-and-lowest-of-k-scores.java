class Solution {
    public int minimumDifference(int[] nums, int k) {
     int l=0; int r=k-1; int min=Integer.MAX_VALUE;
     if(k==1){
        return 0;
     }
     Arrays.sort(nums);
     while(r<nums.length){
       int diff= nums[r]-nums[l];  
       min=Math.min(diff,min);
    l++;
    r++;
     }
    return min;
    }
}