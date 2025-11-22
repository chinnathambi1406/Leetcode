class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       if(nums.length==0)
       {
        return 0;
       }

       int current=1;
       int maxlength=1;
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i]==nums[i-1])
        {
            continue;
        }
         if(nums[i]==nums[i-1]+1)
         {
            current++;
         }
         else
         {
            current=1;
         }
         maxlength=Math.max(current,maxlength);
      } 
      return maxlength;
     
    }
}