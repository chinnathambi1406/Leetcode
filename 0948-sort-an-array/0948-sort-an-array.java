class Solution {
    public int[] sortArray(int[] nums) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++)
       {
        nums[i]=nums[i];
       }
       return nums;
    }
}