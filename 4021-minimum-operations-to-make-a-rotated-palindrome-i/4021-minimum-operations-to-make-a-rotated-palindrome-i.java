class Solution {
    static int pal(String s) {
        int i=0;
        int j=s.length()-1;
        int cost=0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)){
                char a = s.charAt(i);
                char c = s.charAt(j);
                int a1 = Math.abs(a - c);
                int a2 = 26 - Math.abs(a - c);
                cost += Math.min(a1, a2);
            }
            i++;
            j--;
        }
        return cost;
    }

    public int minOperations(String s) {
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int cost=i+pal(s);
            m=Math.min(m,cost);
            s += s.charAt(0);
            s = s.substring(1);
        }
        return m;
    }
}
