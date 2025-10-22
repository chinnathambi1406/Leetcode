class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(word.length!= pattern.length()){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
         for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String words=word[i];
            if(map.containsKey(ch))
            {
              if(!map.get(ch).equals(words)){
                return false;
              }
            }
            else
            {
              if(map.containsValue(words))
              {
                return false;
              }
            }
            map.put(ch,words);

       }
        return true;
    }
}