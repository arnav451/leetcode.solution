class Solution {
    public boolean rotateString(String s, String goal) {
       int n=s.length();
       StringBuilder sb=new StringBuilder(s);
       while(true){
        if(sb.toString().equals(goal)){
            return true;
        }
        char ch=sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(ch);
        n--;
       if(n==0 && !sb.toString().equals(goal)){
        break;
       }
       }
       return sb.toString().equals(goal);
    }
}