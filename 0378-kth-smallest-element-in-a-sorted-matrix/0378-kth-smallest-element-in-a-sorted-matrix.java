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
        return result[k-1];
    }
}