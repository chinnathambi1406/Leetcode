class Solution {
    public int calPoints(String[] operations) {
        List<Integer>list=new ArrayList<>();
       for(int i=0;i<operations.length;i++)
       {
        String op=operations[i];
          if(op.equals("C"))
          {
            list.remove(list.size()-1);
          }
          else if(op.equals("D"))
          {
            int doubled=list.get(list.size()-1)*2;
            list.add(doubled);
          }
         else if(op.equals("+"))
          {
            int sum=list.get(list.size()-1)+list.get(list.size()-2);
            list.add(sum);
          }
          else
          {
            list.add(Integer.parseInt(op));
          }
          
       }
       int total=0;
       for(int i=0;i<list.size();i++)
       {
          total+=list.get(i);
       }
       return total;
    }
}