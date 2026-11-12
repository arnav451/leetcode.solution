class Solution {
    public int maximumLengthSubstring(String s) {
int l=0; int r=0; int ans=0; 
int[] freq=new int[26];
while(r<s.length()){
freq[s.charAt(r)-'a']++;
while(freq[s.charAt(r)-'a']>2){
    freq[s.charAt(l)-'a']--;
    l++;
} 
ans=Math.max(ans,r-l+1);
r++;
}
return ans;
    }
}
