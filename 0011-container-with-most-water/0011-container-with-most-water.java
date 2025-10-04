class Solution {
    public int maxArea(int[] height) {
       int max=0;
       int curr=0;
       int left=0;
       int right=height.length-1 ;
      for(int i=0;i<height.length;i++){
          curr=Math.min(height[left],height[right])*(right-left);
          max=Math.max(curr,max);
          if(height[left]<=height[right]){
            left++;
    
          }
          else{
            right--;
          }
         
       }
       return max;
        
    }
}