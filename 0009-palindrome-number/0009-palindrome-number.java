class Solution {
    public boolean isPalindrome(int x) {
        int pa=x;
        int rev=0;
        while(pa>0)
        {
            int digit=pa%10;
            rev=(rev*10)+digit;
            pa=pa/10;
        }

        if(x>0&&x==rev||x==0)
        {
            return true;
        }
        else{
            return false;
        }
       
    }
}