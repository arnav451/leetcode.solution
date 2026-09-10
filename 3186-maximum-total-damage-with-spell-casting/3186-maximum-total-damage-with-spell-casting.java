class Solution {
    long []dp=new long[100003];
     HashMap<Long , Long> m1=new HashMap<>();
    long fun(int i,int[] nums){
    if(i>=nums.length){
        return 0;
    }
    if(dp[i]!=-1){
        return dp[i];
    }
    int id=nums.length;
    for(int j=i+1;j<nums.length;j++){
        if(nums[j]>nums[i]+2){
          id=j;
          break;
        }
    }
     long take =1L*nums[i]*m1.get((long)nums[i])+fun(id,nums);
    long skip=fun(i+1,nums);
     return dp[i]=Math.max(take,skip);
    }
    public long maximumTotalDamage(int[] power) {
    m1.clear();
     for(int x:power){
        m1.put((long)x,m1.getOrDefault((long)x,0L)+1);
     }  
    int[] nums = new int[m1.size()];
        int k = 0;
     for (Long x : m1.keySet()) {
    nums[k++] = x.intValue();
    }
        Arrays.fill(dp,-1);
    Arrays.sort(nums);
    return fun(0,nums);
    }
}