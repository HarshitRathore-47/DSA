class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int left_p=1;
        int right_p=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(left_p==0){
                left_p=1;
            }
            if(right_p==0){
              right_p=1;
            }
            left_p = left_p * nums[i];
            right_p = right_p * nums[n-1-i];
            ans = Math.max(ans,Math.max(left_p,right_p));
        }
        return ans;
    }
}