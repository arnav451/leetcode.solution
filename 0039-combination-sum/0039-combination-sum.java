class Solution {
    void combsum(int [] nums,int idx,int target,List<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length || target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList <>(curr));
            return;
        }
        curr.add(nums[idx]);
        combsum(nums,idx,target-nums[idx],curr,ans);
        curr.remove(curr.size()-1);
        combsum(nums,idx +1,target,curr,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr =new ArrayList<> ();
        combsum(candidates,0,target,curr,ans);
        return ans;
    }
}