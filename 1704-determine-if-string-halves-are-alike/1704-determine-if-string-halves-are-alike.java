class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String a=s.substring(0,mid);
        String b=s.substring(mid);
        int acount=0;
      for(int i=0;i<a.length();i++)
      {
        char ch=a.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
             || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                acount++;
             }
      }
     int  bcount=0;
       for(int i=0;i<b.length();i++)
      {
        char ch=b.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
             || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                bcount++;
             }
      }
      if(acount==bcount)
      {
        return true;
      }
      return false;
    }
}