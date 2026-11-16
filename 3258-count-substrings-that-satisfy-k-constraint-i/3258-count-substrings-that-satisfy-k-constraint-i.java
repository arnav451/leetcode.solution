class Solution {
    public int countKConstraintSubstrings(String s, int k) {
     int l=0;
     int count0=0;
     int count1=0;
     int  ans=0;
    for(int r=0; r<s.length();r++){
        if(s.charAt(r)=='0'){
            count0++;
        }else{
            count1++;
        }
        while(count0>k&&count1>k){
            if(s.charAt(l)=='0'){
                count0--;
            }else{
                count1--;
            }
            l++;
        }
        ans=ans+r-l+1;
    }
    return ans;
    }
}