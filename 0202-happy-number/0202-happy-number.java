class Solution {
    public boolean isHappy(int n) {
        Set<Integer> check= new HashSet<>();
        while(!check.contains(n)){
            check.add(n);
            n=nextnumber(n);
            if(n==1){
                return true;
            }
        }
        return false;

        
    }
    private int nextnumber(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
}