class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=s.length-1;
        int greed=g.length-1;
        int count=0;
        while(child>=0 && greed>=0){
            if(s[child]>=g[greed]){
                count++;
                child--;
                greed--;
            }
            else{
                greed--;
            }
        }
        return count;

    }
}