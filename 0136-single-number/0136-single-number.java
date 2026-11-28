class Solution {
    public int singleNumber(int[] nums) {
       Set<Integer>set=new HashSet<>();
       int sum=0;
       int sumset=0;
       for(int num:nums){
        if(!set.contains(num)){
            set.add(num);
            sumset +=num;
        }
        sum +=num;
       }
       return 2*sumset-sum;
    }
}