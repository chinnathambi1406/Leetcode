class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int rowbegin=0;
        int rowend=n-1;
        int colbegin=0;
        int colend=m-1;
        while(rowbegin<=rowend&&colbegin<=colend)
        {
            for(int j=colbegin;j<=colend;j++)
            {
                list.add(matrix[rowbegin][j]);

            }
            rowbegin++;
            for(int j=rowbegin;j<=rowend;j++)
            {
                list.add(matrix[j][colend]);
            }
            colend--;
            if(rowbegin<=rowend)
            {
            for(int j=colend;j>=colbegin;j--)
              {
                list.add(matrix[rowend][j]);
              }
            }
            rowend--;
            if(colbegin<=colend){
            for(int j=rowend;j>=rowbegin;j--)
            {
                list.add(matrix[j][colbegin]);
            }}
            colbegin++;

        }
        return list;
        
    }
}