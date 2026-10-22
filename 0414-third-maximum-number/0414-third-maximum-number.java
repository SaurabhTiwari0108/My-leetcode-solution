class Solution {
    public int thirdMax(int[] nums) {
        long firstmax=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>firstmax){
                firstmax=nums[i];
            }
        }
        long secondmax=Long.MIN_VALUE;
        for(int j=0; j<nums.length; j++){
            if(nums[j]>secondmax && nums[j]!=firstmax){
                secondmax=nums[j];
            }
        }
        long thirdmax=Long.MIN_VALUE;
        for(int k=0; k<nums.length; k++){
            if(nums[k]>thirdmax && nums[k]!=firstmax && nums[k]!=secondmax){
                thirdmax=nums[k];
            }
        }
        if(thirdmax!=Long.MIN_VALUE){
            return (int) thirdmax;
        }
        return (int) firstmax;
    }
}