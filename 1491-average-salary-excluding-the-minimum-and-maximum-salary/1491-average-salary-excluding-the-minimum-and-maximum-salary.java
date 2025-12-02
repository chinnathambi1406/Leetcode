class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
      int total=0;
      int min=salary[0];
      int max=salary[n-1];
      for(int i=0;i<salary.length;i++)
      {
        total+=salary[i];
      }
     
      int res=total-(min+max);
      return(double) res/(n-2);
    }
}