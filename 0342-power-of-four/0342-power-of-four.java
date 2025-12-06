class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<=15;i++)
        {
            int num=(int)Math.pow(4,i);
            if(n==num){
                return true;
            }
        }
        return false;
    }
    
}