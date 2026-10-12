class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        int maxlength=1;
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int nuum:set){
            if(!set.contains(nuum-1)){
                int count=1;
                int x=nuum;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                maxlength=Math.max(maxlength,count);
            }
        }
        return maxlength;
    }
}