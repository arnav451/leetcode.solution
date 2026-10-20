import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
     int left=0; int right=0; int maxlen=0; int k=2;
     HashMap<Integer,Integer> map=new HashMap<>();
     while(right<fruits.length){
        map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
     
     if(map.size()>k){
        map.put(fruits[left],map.get(fruits[left])-1);
     
     if(map.get(fruits[left])==0){
        map.remove(fruits[left]);
     }
        left++;
     }
     if(map.size()<=k){
     maxlen=Math.max(maxlen,right-left+1);
     }
     right++;
        }
     return maxlen;
    }
}