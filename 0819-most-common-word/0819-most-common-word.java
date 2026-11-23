class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    HashMap<String,Integer> map = new HashMap<>();
    HashSet<String>set=new HashSet<>();
    for(String word:banned){
        set.add(word);
    }

    String[] words = paragraph.toLowerCase().split("[!?',;. ]+");

    for(String word : words) {
        if(!set.contains(word)) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
    }
  String ans = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
            return ans;
    }
}