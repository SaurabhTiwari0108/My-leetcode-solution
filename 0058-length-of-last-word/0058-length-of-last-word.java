class Solution {
    public int lengthOfLastWord(String s) {
        // //split string by one or more spaces
        // String word[]= s.trim().split("\\s+");
        // return word[word.length-1].length();

        String trimmed=s.trim();
        int length=0;
        for(int i=trimmed.length()-1; i>=0; i--){
            if(trimmed.charAt(i)==' '){
                break;
            }
            length++;
        }
        return length;
    }
}