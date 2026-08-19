import java.util.*;
class Solution {
    public void func(List<Integer>output,List<Integer> input,List<List<Integer>> ans){

        ans.add(new ArrayList<>(output));

        if(input.size()==0){
            return;
        }
        for(int i=0;i<input.size();i++){
            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);
            op.add(ip.get(i));
            ip.subList(0,i+1).clear();
            func(op,ip,ans);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int a:nums){
            input.add(a);

        }
        func(output,input,ans);


        
        HashSet<List<Integer>> set = new HashSet<>(ans);

        List<List<Integer>> result = new ArrayList<>(set);

        return result;
    }
}

