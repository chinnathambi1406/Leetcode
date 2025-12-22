class Solution {
    public int subsetXORSum(int[] nums) {
      List<List<Integer>>result=new ArrayList<>();
      result.add(new ArrayList<>());
      for(int num:nums)
      {
        int size=result.size();
         for(int i=0;i<size;i++)
        {
            ArrayList<Integer>list=new ArrayList<>(result.get(i));
            list.add(num);
            result.add(list);
        }
      }
      int totalsum=0;
      for(List<Integer>inner:result)
      {
         int sum=0;
         for(int num:inner)
         {
            sum^=num;
         }
         totalsum+=sum;
      }
      return totalsum;
    }
}