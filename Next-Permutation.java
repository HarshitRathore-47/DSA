class Solution {
    public static int[] reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        return nums;
    }

    public static int[] swap(int[] nums,int i,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
    public void nextPermutation(int[] nums) {
        int bp=-1;
        int n= nums.length;

        for(int i = n-2;i>=0;i--){
           if(nums[i] <nums[i+1]){
               bp=i;
               break;
           }
        }
        if(bp==-1){
             reverse(nums,0,n-1);
             return;
        } 

        for(int i=n-1;i>bp;i--){
            if(nums[bp]<nums[i]){
                swap(nums,bp,i);
                break;
            }
        }
        reverse(nums,bp+1,n-1);
        return;
    }
}