class Solution {
    public int longestPalindrome(String s) {
       Map<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int length=0;
       boolean hasodd=false;
       for(char key:map.keySet()){
        if(map.get(key)%2==0)
        {
            length+=map.get(key);
        }
        else{
            length+=map.get(key)-1;
            hasodd=true;
        }
       }
       if(hasodd)
       {
        length+=1;
       }
       return length;
    }
}