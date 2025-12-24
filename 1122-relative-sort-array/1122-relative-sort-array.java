class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) { 
        Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<arr1.length;i++)
       {
         map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
       }
       int result[]=new int[arr1.length];
       int index=0;
       for(int num:arr2)
       {
        while(map.get(num)>0)
        {
            result[index++]=num;
            map.put(num,map.get(num)-1);
            
        }
        map.remove(num);
       }
       List<Integer>main=new ArrayList<>();
    for(int key:map.keySet())
    {
       while(map.get(key)>0)
       {
          main.add(key);
          map.put(key,map.get(key)-1);
       }
    }
    Collections.sort(main);
    for(int num:main)
    {
        result[index++]=num;
    }
    return result;
    }
}