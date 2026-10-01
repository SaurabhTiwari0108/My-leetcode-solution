class Solution {
    public int lengthOfLastWord(String s) {
        //split string by one or more spaces
        String word[]= s.trim().split("\\s+");
        return word[word.length-1].length();
    }
}