class Solution {
    public String greatestLetter(String s) {
        String str="";
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
        }
      for(char ch='Z';ch>='A';ch--)
      {
         if(set.contains(Character.toLowerCase(ch))&&set.contains(Character.toUpperCase(ch)))
            {
              str+=ch;
              return str;
            }
      }
      return "";
    }
}