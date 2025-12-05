class Solution {
    public boolean isBalanced(String num) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            int d1=ch-'0';
            if(i%2==0)
            {
                sum+=d1;
            }
            else{
                sum1+=d1;
            }
        }
       return sum==sum1;
    }
}