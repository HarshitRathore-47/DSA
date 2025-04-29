class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
       int[] pse = new int[n+1];
        int[] nse = new int[n];
        Stack<Integer> stackpse =new Stack<>();
        Stack<Integer> stacknse =new Stack<>();
        //for pse
        for(int i=0;i<n;i++){
           while(!stackpse.isEmpty() && heights[stackpse.peek()] > heights[i]){
               stackpse.pop();
           }
           pse [i]=(stackpse.isEmpty()) ? -1 : stackpse.peek();
           stackpse.push(i);
        }
        //for nse
        for(int i=n-1;i>=0;i--){
           while(!stacknse.isEmpty() && heights[stacknse.peek()] >= heights[i]){
               stacknse.pop();
           }
           nse [i]=(stacknse.isEmpty()) ? n : stacknse.peek();
           stacknse.push(i);
        }
        for(int i=0;i<n;i++){
            max=Math.max(heights[i]*(nse[i]-pse[i]-1),max);
        }
        return max;
    }
}