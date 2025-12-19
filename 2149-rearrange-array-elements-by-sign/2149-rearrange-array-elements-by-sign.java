class Solution {
    public int[] rearrangeArray(int[] nums) {
       int result[]=new int[nums.length];
       int ev=0;
       int odd=1;
        for(int num:nums)
        {
            if(num>0)
            {
                result[ev]=num;
                ev+=2;
            }
            else
            {
                result[odd]=num;
                odd+=2;
            }
        }
       return result;
        
    }
}