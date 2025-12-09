class Solution {
    public long findMaximumScore(List<Integer> nums) {
         long res =0;
        long max=nums.get(0);
        for(int i=1;i<nums.size();i++)
        {
            res+=max;
            if(nums.get(i)>max)
            {
                max=nums.get(i);
                
            }
        }
        return res;
    }
}