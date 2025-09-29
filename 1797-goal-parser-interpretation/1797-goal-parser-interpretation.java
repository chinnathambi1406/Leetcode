class Solution {
    public String interpret(String command) {
        StringBuilder res=new StringBuilder();
        int i=0;
       while(i<command.length())
        {
            
            if(command.charAt(i)=='G')
            {
                res.append("G");
                i++;
               
            }
            else if(i+1<command.length()&&command.charAt(i)=='('&&command.charAt(i+1)==')')
            {
                res.append("o");
                i+=2;
            }
            else if(i+3<command.length()&&command.substring(i,i+4).equals("(al)"))
            {
                res.append("al");
                i+=4;
            }
        }
        return res.toString();
    }
}