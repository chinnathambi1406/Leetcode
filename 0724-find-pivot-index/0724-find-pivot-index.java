class Solution {
    public int pivotIndex(int[] nums) {
        for(int mid=0;mid<nums.length;mid++)
        {
            int left=0;
            for(int i=0;i<mid;i++)
            {
                left+=nums[i];
            }
            int right=0;
            for(int i=mid+1;i<nums.length;i++)
            {
                   right+=nums[i];
            }
            if(left==right)
            {
                return mid;
            }
        }
        return -1;
    }
}