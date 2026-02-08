class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
      HashSet<Integer>set=new HashSet<>();
      long sum=0;
      for(int n:nums){
        if(!set.contains(n)&&n<=k)
        {
            sum+=n;
            k++;
        }
        set.add(n);
      }
      return(long) (k+1)*k/2-sum;
    }
}