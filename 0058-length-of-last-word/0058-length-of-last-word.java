class Solution {
    public int lengthOfLastWord(String s) {
        String Word[]=s.split(" ");
        String lastword=Word[Word.length-1];
        int length=lastword.length();
        return length;
    }
}