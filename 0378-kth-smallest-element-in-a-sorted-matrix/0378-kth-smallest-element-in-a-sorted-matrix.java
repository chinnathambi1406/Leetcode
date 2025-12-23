class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int col=matrix[0].length;
        int index=0;
        int result[]=new int[row*col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[index++]=matrix[i][j];
            }
        }
        Arrays.sort(result);
      for(int i=0;i<result.length;i++)
      {
        if(i==k-1)
        {
            return result[i];
        }
      }
      return -1;
    }
}