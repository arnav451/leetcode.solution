class Solution {

    void fun(int start, int k, int target,
             List<Integer> tmp, List<List<Integer>> ans) {

        // We have selected k numbers
        if (k == 0) {

            // Check whether their sum is target
            if (target == 0) {
                ans.add(new ArrayList<>(tmp));
            }

            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {

            // If i is already greater than target,
            // no further number will work
            if (i > target)
                break;

            // Choose i
            tmp.add(i);

            // Move to i + 1 because
            // the same number cannot be reused
            fun(i + 1, k - 1, target - i, tmp, ans);

            // Backtrack
            tmp.remove(tmp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> tmp = new ArrayList<>();

        fun(1, k, n, tmp, ans);

        return ans;
    }
}