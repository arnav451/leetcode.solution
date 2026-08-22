class Solution {
    void fun(int i,String s,StringBuilder Tmp,List<String> ans, HashMap<Character,String> map){
        if(i>=s.length()){
            ans.add(Tmp.toString());
            return;
        }
        String Letter=map.get(s.charAt(i));
        for(int j=0;j<Letter.length();j++){
            Tmp.append(Letter.charAt(j));
            fun(i+1,s,Tmp,ans,map); 
            Tmp.deleteCharAt(Tmp.length()-1);
        }
    }
    public List<String> letterCombinations(String s) {
        List<String> ans=new ArrayList<>();
        if(s.length()==0){
            return ans;
        }
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
       
       fun(0,s,new StringBuilder(),ans,map);
       return ans;
        
        
    }
}