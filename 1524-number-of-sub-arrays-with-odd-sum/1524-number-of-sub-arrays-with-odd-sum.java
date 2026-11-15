class Solution {  
    int M = 1_000_000_007;
    public int numOfSubarrays(int[] arr) {
      int n=arr.length;
      int even=1;
      int odd=0;
      int sum=0;
      int count=0;
      for(int i=0; i<n; i++){
        sum=sum+arr[i];
        if(sum%2==0){
            count=(count+odd)%M;
            even++;
        }else{
            count=(count+even)%M;
            odd++;
        }
      }  
      return count;
    }
}