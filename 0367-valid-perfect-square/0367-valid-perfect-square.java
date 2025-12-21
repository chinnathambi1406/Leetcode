class Solution {
    public boolean isPerfectSquare(int num) {
        int last=num%10;
        if(last==2||last==3||last==8||last==7)
        {
            return false;
        }
        if(num==1)
        {
            return true;
        }
        for(int i=1;i*i<=num;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
}