import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int candy:candyType){
            set.add(candy);
        }
  return  Math.min(set.size(),n/2);
    }
}