class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=arr[i+1]-arr[i];
            list.add(diff);
        }
        for(int i=0;i<list.size()-1;i++)
        {
            if (!list.get(i).equals(list.get(i + 1)))
            {
                return false;
            }
        }
        return true;
    }
}