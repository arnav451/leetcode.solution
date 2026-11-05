class Solution { 
    private boolean goodSubstring(int[] arr){
         for(int i=0;i<26;i++){
        if(arr[i]>1){
            return false;
        }
      }  
      return true;
    }
    public int countGoodSubstrings(String s) {
        int l=0; int count=0;
        int[] arr=new int [26];
        for(int r=0;r<s.length();r++){
           arr[s.charAt(r)-'a']++;
           int len=r-l+1;
           if(len==3){
            if(goodSubstring(arr)){
            count++;
           }
           arr[s.charAt(l)-'a']--;
           l++;
        }
        }
        return count;
    }
}  
