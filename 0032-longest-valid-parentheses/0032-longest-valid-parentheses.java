class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Integer> stack= new Stack<>();
        // int maxLen=0;
        // stack.push(-1);
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i)=='('){
        //         stack.push(i);
        //     }
        //     else{
        //         stack.pop();
        //         if(stack.isEmpty()){
        //             stack.push(i);
        //         }else{
        //             maxLen= Math.max(maxLen,i-stack.peek());
        //         }
        //     }
        // }
        // return maxLen;

        int left=0,right=0,maxLen=0;
        //from left to right
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                maxLen=Math.max(maxLen,2*right);
            }
            else if(right>left){
                left=right=0;
            }
        }
        //from right to left
        left=right=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                maxLen=Math.max(maxLen,2*left);
            }
            else if(right<left){
                left=right=0;
            }
        }
        return maxLen;
        
        
    }
}