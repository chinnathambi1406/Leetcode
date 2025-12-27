class Solution {
    public int maximum69Number (int num) {
        int count=0;
        int temp=num;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int result[]=new int[count];


        for(int i=count-1;i>=0;i--)
        {
            int digit=num%10;
            result[i]=digit;
            num/=10;
        }
      
       for(int i=0;i<result.length;i++)
       {
        if(result[i]==6)
        {
              result[i]=9;
              break;
        }

       }
       int nums=0;
       for(int i=0;i<result.length;i++)
       {
         num=num*10+result[i];
       }
       return num;
    }
}