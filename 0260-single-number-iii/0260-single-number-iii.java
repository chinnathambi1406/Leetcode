class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}