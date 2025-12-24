class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<String>list =new ArrayList<>();
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
                 list.add(s.substring(i,i+p.length()));
        }
         char arr[]=p.toCharArray();
         Arrays.sort(arr);
         String pstr=new String(arr);
         for(int i=0;i<list.size();i++)
         {
            char arr1[]=list.get(i).toCharArray();
            Arrays.sort(arr1);
            String str=new String(arr1);
           if(pstr.equals(str))
           {
            result.add(i);
           }
         }
         return result;
        
    }
}