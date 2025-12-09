class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid=nums.length/2;
        int first[]=new int[mid];
        int second[]=new int[mid];
        for(int i=0;i<mid;i++)
        {
            first[i]=nums[i];
      }
      for(int i=mid;i<nums.length;i++)
      {
        second[i-mid]=nums[i];
      }
      int index=0;
      int result[]=new int[first.length+second.length];
      for(int i=0;i<first.length;i++)
      {
    result[index++]=first[i];
    result[index++]=second[i];
      }
      return result;
                        
    }
}