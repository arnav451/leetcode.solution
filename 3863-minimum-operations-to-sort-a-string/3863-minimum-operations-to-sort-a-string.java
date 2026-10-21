import java.util.Arrays;

class Solution {
public int minOperations(String s) {
int n = s.length();
    if (isSorted(s)) {
        return 0;
    }

    if (n == 2) {
        return -1;
    }

    char minChar = s.charAt(0);
    char maxChar = s.charAt(0);

    for (int i = 1; i < n; i++) {
        minChar = (char) Math.min(minChar, s.charAt(i));
        maxChar = (char) Math.max(maxChar, s.charAt(i));
    }

    if (s.charAt(0) == minChar || s.charAt(n - 1) == maxChar) {
        return 1;
    }

    char maxMid = s.charAt(1);
    char minMid = s.charAt(1);

    for (int i = 2; i < n - 1; i++) {
        maxMid = (char) Math.max(maxMid, s.charAt(i));
        minMid = (char) Math.min(minMid, s.charAt(i));
    }

    if (s.charAt(0) > maxMid && s.charAt(n - 1) < minMid) {
        return 3;
    }

    return 2;
}

private boolean isSorted(String s) {
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i - 1) > s.charAt(i)) {
            return false;
        }
    }
    return true;
}
}
