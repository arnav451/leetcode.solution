class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int ascii=(int) ch;
        String binary=Integer.toBinaryString(ascii);
        while(binary.length()<8){
            binary="0"+binary;
        }
        str.append(binary);
      }
        int left=0;
        int right=str.length()-1;
        while(left<right){
           if(str.charAt(left)!=str.charAt(right)){
            return false;
           }
           left++;
           right--;
        }
        return true;
      
    }
}