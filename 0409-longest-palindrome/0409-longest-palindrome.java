class Solution {
    public int longestPalindrome(String s) {
   int n=s.length();
   HashMap<Character,Integer>map=new HashMap<>();
   int result=0;
   for(char ch:s.toCharArray()){
    if(map.containsKey(ch)){
        result +=2;
        map.remove(ch);
    }else{
        map.put(ch,1);
    }
   }
   if(!map.isEmpty()){
    result++;
   }
   return result;
    }
}