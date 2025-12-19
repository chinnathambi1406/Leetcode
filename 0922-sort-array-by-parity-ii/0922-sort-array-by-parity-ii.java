class Solution {
    public int[] sortArrayByParityII(int[] nums) {
            int result[]=new int[nums.length];
        int e=0;
        int o=1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                result[e]=num;
                e+=2;
            }
            else
            {
                result[o]=num;
                o+=2;
            }

        }
        return result;
    }
}