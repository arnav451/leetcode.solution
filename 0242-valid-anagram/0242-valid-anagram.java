class Solution {
    public boolean isAnagram(String s, String t) {
      int [] freq = new int[26] ;
      for(char ch:s.toCharArray()){
        int idx= ch-'a';
        freq[idx]=freq[idx]+1;
      } 
      for(char ch:t.toCharArray()){
        int idx= ch-'a';
        freq[idx]=freq[idx]-1;
      } 
      for(int i=0 ;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
      }
      return true;
    }
}