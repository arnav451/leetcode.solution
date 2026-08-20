class Solution {

    void combSum(List<Integer> input, List<Integer> output,
                 int target, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }
        if (input.size() == 0 || target < 0) {
            return;
        }
        int x = input.get(0);
        output.add(x);

        combSum(input, output, target - x, ans);

        output.remove(output.size() - 1);

        List<Integer> newInput = new ArrayList<>(input);
        newInput.remove(0);

        combSum(newInput, output, target, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> input = new ArrayList<>();

        for (int x : candidates) {
            input.add(x);
        }

        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combSum(input, output, target, ans);
        return ans;
    }
}