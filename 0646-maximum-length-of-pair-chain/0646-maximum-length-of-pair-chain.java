class Solution {
    int []dp=new int[1001];
    int fun(int i,int[][]pairs){
     if(i>=pairs.length){
        return 0;
     }
      int idx=pairs.length;
     if(dp[i]!=-1){
        return dp[i];
     }
     for(int j=i+1;j<pairs.length;j++){
        if(pairs[j][0]>pairs[i][1]){
            idx=j;
            break;
        }
     }
    int a= 1+fun(idx,pairs);
    int b=fun(i+1,pairs);
     return dp[i]= Math.max(a,b);
    }
public int findLongestChain(int[][] pairs) {
 Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
    Arrays.fill(dp,-1);
      return fun(0,pairs);
    }
}