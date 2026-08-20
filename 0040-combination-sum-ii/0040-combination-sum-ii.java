import java.util.*;

class Solution {

    void fun(int s, int[] nums, List<Integer> tmp,
             List<List<Integer>> ans, int target,
             Map<List<Integer>, Integer> m1) {

        if (s > target) return;

        if (s == target) {
            if (!m1.containsKey(tmp)) {
                ans.add(new ArrayList<>(tmp));
                m1.put(new ArrayList<>(tmp), 1);
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            List<Integer> ip = new ArrayList<>();
            for (int x : nums) {
                ip.add(x);
            }

            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = 0; j <= i; j++) {
                ip.remove(0);
            }

            tmp.add(nums[i]);
            int[] newNums = new int[ip.size()];
            for (int j = 0; j < ip.size(); j++) {
                newNums[j] = ip.get(j);
            }

            fun(s + nums[i], newNums, tmp, ans, target, m1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> tmp = new ArrayList<>();
        Map<List<Integer>, Integer> m1 = new HashMap<>();
        fun(0, nums, tmp, ans, target, m1);
        return ans;
    }
}