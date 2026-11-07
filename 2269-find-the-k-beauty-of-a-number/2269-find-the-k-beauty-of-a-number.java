class Solution {
    public int divisorSubstrings(int num, int k) {
     int l=0; int r=0; int count=0;  
     String s = String.valueOf(num);
     while(r<s.length()){
       if(r-l+1==k){
       int val=Integer.parseInt(s.substring(l,r+1));
       if(val!=0 &&num%val==0){
        count++;
       } 
       l++;  
       }
       r++; 
     } 
     return count;
    }
}