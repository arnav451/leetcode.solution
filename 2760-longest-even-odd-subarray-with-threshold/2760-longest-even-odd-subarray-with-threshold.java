class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0;
        int r = 0;
        int ans = 0;

        while (r < nums.length) {

            if (nums[r] > threshold) {
                l = r + 1;
            }
            else if (r == l && nums[r] % 2 != 0) {
                l = r + 1;
            }
            else if (r > l && nums[r] % 2 == nums[r - 1] % 2) {
                if (nums[r] % 2 == 0) {
                    l = r;
                } else {
                    l = r + 1;
                }
            }

            if (l <= r) {
                ans = Math.max(ans, r - l + 1);
            }

            r++;
        }

        return ans;
    }
}