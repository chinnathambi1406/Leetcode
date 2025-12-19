class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
    for(int i=0;i<digits.length;i++)
    {
        for(int j=0;j<digits.length;j++)
        {
            for(int k=0;k<digits.length;k++)
            {
                if (i != j && i != k && j != k){
               if(digits[i]!=0)
               {
                   if(digits[k]%2==0)
                   {
                    int digit=digits[i]*100+digits[j]*10+digits[k];
                    set.add(digit);
                   }
               }
                }
            }
        }
    }
  int[] result = new int[set.size()];
  int in=0;
      for(int num:set)
      {
        result[in++]=num;
      }
      Arrays.sort(result);
      return result;
        
    }
}