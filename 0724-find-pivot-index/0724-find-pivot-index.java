class Solution {
    public int pivotIndex(int[] nums) {
         for (int mid = 0; mid < nums.length; mid++) {

            int leftSum = 0;
            for (int i = 0; i < mid; i++) {
                leftSum += nums[i];
            }

            int rightSum = 0;
            for (int i = mid + 1; i < nums.length; i++) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum) {
                return mid;
            }
        }
        return -1;
    }
}