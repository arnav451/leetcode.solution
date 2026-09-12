class Solution {
    public int minimumBeautifulSubstrings(String s) {
        int ans = fun(s, 0, 0);
        return ans >= 1e9 ? -1 : ans;
    }

    public static int check(int l, int r, String s) {
        if (s.charAt(l) == '0') {
            return 0;
        }

        int num = 0;
        for (int i = l; i <= r; i++) {
            num = num * 2 + (s.charAt(i) - '0');
        }

        int val = 1;
        while (val < num) {
            val *= 5;
        }

        return val == num ? 1 : 0;
    }

    public static int fun(String s, int i, int prev) {
        if (i == s.length()) {
            return (prev == i) ? 0 : (int) 1e9;
        }

        int m = (int) 1e9;

        if (check(prev, i, s) == 1) {
            int a = 1 + fun(s, i + 1, i + 1);
            m = Math.min(m, a);
        }

        int a = fun(s, i + 1, prev);
        m = Math.min(m, a);

        return m;
    }
}