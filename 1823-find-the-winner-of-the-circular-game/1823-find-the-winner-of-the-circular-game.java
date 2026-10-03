class Solution {
    int fun(int i,int k,ArrayList<Integer> list){
        if(list.size()==1){
        return list.get(0);
        }
         i= (i + k - 1) % list.size();
        list.remove(i);
        return fun(i,k,list);
    }
    public int findTheWinner(int n, int k) {
      ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
        list.add(i);
        }
        return fun(0,k,list);
    }
}