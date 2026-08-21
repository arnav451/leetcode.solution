class Solution {
    void func(String s,int n,int a,int b,List<String> ans){
        if(b>a ||(a>n||b>n)){
            return;
        }
        if(s.length()==n *2){
            ans.add(s);
            return;
        }
        func(s+"(",n,a+1,b,ans);
        func(s+")",n,a,b+1,ans);
    }
    public List<String> generateParenthesis(int n) {
       List<String> ans=new ArrayList<>();
       func("",n,0,0 ,ans);
       return ans;
    }
}