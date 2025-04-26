class Solution {
    public int sumSubarrayMins(int[] arr) {
        int total= 0;
        int n= arr.length;
        int  mod = 1000000007;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Stack<Integer> stackpse =new Stack<>();
        Stack<Integer> stacknse =new Stack<>();
        //for pse
        for(int i=0;i<n;i++){
           while(!stackpse.isEmpty() && arr[stackpse.peek()] > arr[i]){
               stackpse.pop();
           }
           pse [i]=(stackpse.isEmpty()) ? -1 : stackpse.peek();
           stackpse.push(i);
        }
        //for nse
        for(int i=n-1;i>=0;i--){
           while(!stacknse.isEmpty() && arr[stacknse.peek()] >= arr[i]){
               stacknse.pop();
           }
           nse [i]=(stacknse.isEmpty()) ? n : stacknse.peek();
           stacknse.push(i);
        }
        for(int i=0;i<n;i++){
            int left = i-pse[i];
            int right= nse[i]-i;
            int eles=left*right ;
            long sum = ((long) arr[i] * left * right) % mod;
            total = (int) ((total + sum) % mod);
        }
        return total;
    }
}