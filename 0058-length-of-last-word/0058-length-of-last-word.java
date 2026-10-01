class Solution {
    public int lengthOfLastWord(String s) {
        //brute force
        // //split string by one or more spaces
        // String word[]= s.trim().split("\\s+");
        // return word[word.length-1].length();

        //better solution
        // String trimmed=s.trim();
        // int length=0;
        // for(int i=trimmed.length()-1; i>=0; i--){
        //     if(trimmed.charAt(i)==' '){
        //         break;
        //     }
        //     length++;
        // }
        // return length;

        //optimal solution
        int i=s.length()-1;
        int length=0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;

    }
}