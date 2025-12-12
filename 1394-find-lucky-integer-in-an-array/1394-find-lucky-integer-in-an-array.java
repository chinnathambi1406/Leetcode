class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        for(int key:map.keySet())
        {
            if(key==map.get(key))
            {
                max=Math.max(key,max);
              
            }
             
        }
      if(max>0) return max;
      return -1;
    }
}