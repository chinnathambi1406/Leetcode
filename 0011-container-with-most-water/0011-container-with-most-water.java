class Solution {
    public int maxArea(int[] height) {
      int left=0;
      int right=height.length-1;
      int curr=0;
      int max=0;
      while(left<right)
      {
        curr=Math.min(height[left],height[right])*(right-left);
        max=Math.max(curr,max);
        if(height[left]<=height[right])
        {
            left++;
        }
        else{
            right--;
        }
      }
      return max;
        
    }
}