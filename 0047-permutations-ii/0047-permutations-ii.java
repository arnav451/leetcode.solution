class Solution {
    void perm(List<Integer> input,List<Integer> output,List<List<Integer>> ans){
        if(input.size()==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        for(int i=0;i<input.size();i++){
             if(i>0 && input.get(i).equals(input.get(i - 1))){
                continue;
            }
        List<Integer> ip=new ArrayList<>(input);
        List<Integer> op=new ArrayList<>(output);
        op.add(ip.get(i));
        ip.remove(i);
        perm(ip,op,ans);
    }
    }

    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input =new ArrayList<>();
        List<Integer> output =new ArrayList<>();
        Arrays.sort(nums);
         for(int a:nums){
            input.add(a);
        }
        Set<List<Integer>> set =new HashSet<>();
        perm(input,output,ans);
        return new ArrayList<>(ans);
    }
}