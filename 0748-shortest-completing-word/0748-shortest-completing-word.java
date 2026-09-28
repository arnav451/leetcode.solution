class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];

        for(char c : licensePlate.toCharArray()) {
        if(Character.isLetter(c)) {
                need[Character.toLowerCase(c)-'a']++;
        }
                }

        String ans ="";

        for (String word : words) {
            int[] have = new int[26];

            for (char c:word.toCharArray()) {
                have[c-'a']++;
            }
            boolean possible = true;
            for (int i=0; i<26; i++) {
                if (have[i] < need[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible && (ans.equals("") || word.length() < ans.length())) {
                ans = word;
            }
        }

        return ans;
    }
}