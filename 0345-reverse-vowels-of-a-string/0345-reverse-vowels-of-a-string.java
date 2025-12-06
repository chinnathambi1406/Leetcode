class Solution {
    public String reverseVowels(String s) {
      char arr[]=s.toCharArray();
      int left =0;
      int right=arr.length-1;
      while(left<right)
      {
        if(!isvowel(arr[left]))
        {
            left++;
            continue;
        }
        if(!isvowel(arr[right]))
        {
            right--;
            continue;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
      }
      return new String(arr);
    }
       private boolean isvowel(char c)
      {
        return "aeiouAEIOU".indexOf(c) != -1;
      }
    
}