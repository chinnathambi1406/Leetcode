class Solution {
    public int maxProduct(int[] nums) {
   
        int max=1;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                 max=(nums[i]-1)*(nums[j]-1);
                result=Math.max(max,result);
            }
        }
        return result;
    }
}