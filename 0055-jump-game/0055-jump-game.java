class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        {
            return true;
        }
        int last=nums.length-1;
        int maxreach=nums[0];
        for(int i=1;maxreach>=i;i++)
        {
            if(maxreach>=last)
            {
                return true;
            }
            else
            {
                maxreach=Math.max(maxreach,nums[i]+i);
            }
        }
      return false;
        
    }
}