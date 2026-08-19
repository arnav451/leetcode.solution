class Solution {
     void subset( int[]nums,int idx,List<Integer> curr,List<List<Integer>>  ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        subset(nums,idx+1,curr,ans);
        curr.remove(curr.size()-1);
        subset(nums,idx+1,curr,ans);
        }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       Set<List<Integer>> set = new HashSet<>(); 
       Arrays.sort(nums);
       subset(nums,0,curr,ans);
       set.addAll(ans);
       return new ArrayList<>(set) ;
    }
}