class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character,Integer> map=new HashMap<>();
     HashMap<Character,Integer>freq=new HashMap<>();
     for(char ch:ransomNote.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
     }  
    for(char cnt:magazine.toCharArray()){
        freq.put(cnt,freq.getOrDefault(cnt,0)+1);
    } 
     for(char ch : map.keySet()) {
        if(freq.getOrDefault(ch, 0) < map.get(ch)) {
            return false;
    }
     }
    return true;
}
    }