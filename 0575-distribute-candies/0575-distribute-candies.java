class Solution {
    public int distributeCandies(int[] candyType) {
      int n=candyType.length;
      int eat=n/2;
      int min=0;
      HashSet<Integer>set=new HashSet<>();
      for(int i=0;i<candyType.length;i++)
      {
            set.add(candyType[i]);
      }
      min=Math.min(set.size(),eat);
      return min;
        
    }
}