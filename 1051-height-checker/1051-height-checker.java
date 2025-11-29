class Solution {
    public int heightChecker(int[] heights) {
        int exp[]=new int[heights.length];
        int n=heights.length;
        for(int i=0;i<heights.length;i++)
        {
            exp[i]=heights[i];
        }
        for(int i=0;i<exp.length-1;i++)
        {
            for(int j=0;j<exp.length-i-1;j++)
            {
             if(exp[j]>exp[j+1])
                {
                    int temp=exp[j+1];
                    exp[j+1]=exp[j];
                    exp[j]=temp;
                }
            }
        }
    
       
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
           if(heights[i]!=exp[i])
            {
                count++;
              }
        
        }
        return count;
    }
}