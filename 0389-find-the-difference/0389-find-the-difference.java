class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<String> set= new HashSet<>();
        int count[]=new int[26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            count[ch-'a']++;
            set.add(ch+""+count[ch-'a']);
        }
        int countt[]=new int[26];
        for(int j=0; j<t.length(); j++){
            char ch=t.charAt(j);
            countt[ch-'a']++;

            if(!set.contains(ch+""+countt[ch-'a'])){
                return ch;
            }
        }
        return ' ';
        
    }
}