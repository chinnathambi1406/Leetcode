class Solution {
    public int hIndex(int[] citations) {
        int h=0;
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<n;i++)
        {
            int paper=n-i;
            if(citations[i]>=paper)
            {
                h=paper;
                break;
            }
        }
        return h;

    }
}