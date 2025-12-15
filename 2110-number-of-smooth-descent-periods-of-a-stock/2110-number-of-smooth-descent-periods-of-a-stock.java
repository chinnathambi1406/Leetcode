class Solution {
    public long getDescentPeriods(int[] prices) {
        long length=1;
         long total=1;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]==prices[i-1]-1)
            {
                length++;
            }
            else
            {
                length=1;
            }
            total+=length;
        }
        return total;
    }
}