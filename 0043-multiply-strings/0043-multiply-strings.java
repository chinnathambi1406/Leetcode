class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
        return "0";
        int i=num1.length()-1;
        int j=num2.length()-1;
      int result[]=new int[num1.length()+num2.length()];
        StringBuilder res=new StringBuilder();
        while(i>=0)
        {
            j=num2.length()-1;
            while(j>=0)
            {
            int n1=num1.charAt(i)-'0';
             int n2=num2.charAt(j)-'0';
             int mul=n1*n2;
             int sum=mul+result[i+j+1];
            result[i+j+1]=sum%10;
             result[i+j]+=sum/10;
             j--;
            }
             i--;
             
        }
        for(int num:result)
        {
            if(res.length()==0&&num==0)
            {
                continue;
            }
            res.append(num);
        }
        return res.toString();
    }
}