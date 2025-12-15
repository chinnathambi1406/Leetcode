class Solution {
    public void sortColors(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      
      int index=0;
     for(int i=0;i<=2;i++)
     {
        int freq=map.getOrDefault(i,0);
        for(int j=0;j<freq;j++)
        {
            nums[index++]=i;
        }
     }
    }
}