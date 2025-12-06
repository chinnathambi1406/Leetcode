class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<=19;i++)
        {
            int num=(int)Math.pow(3,i);
            if(n==num){
                return true;
            }
        }
        return false;
    }
}