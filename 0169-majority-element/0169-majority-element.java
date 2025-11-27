class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer>map=new HashMap<>();
       int m=nums.length/2;
       for(int i=0;i<nums.length;i++)
       {
           int num=nums[i];
           int count=map.getOrDefault(num,0)+1;
           if(count>m)
           {
             return num;
           }
           
            map.put(num,count);
           

       }
       return -1;
    }
}