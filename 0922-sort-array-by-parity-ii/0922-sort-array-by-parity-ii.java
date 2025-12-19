class Solution {
    public int[] sortArrayByParityII(int[] nums) {
          int even[]=new int[nums.length/2];
          int odd[]=new int[nums.length/2];
          int e=0,o=0;
          for(int i=0;i<nums.length;i++)
          {
            if(nums[i]%2==0){
                even[e++]=nums[i];
            }else
            {
                odd[o++]=nums[i];
            }
          }
          int result[]=new int[nums.length];
          int ev=0;
          int od=0;
          for(int i=0;i<nums.length;i++)
          {
              if(i%2==0)
              {
                 result[i]=even[ev++];
              }
              else{
                result[i]=odd[od++];
              }
          }
          return result;
    }
}