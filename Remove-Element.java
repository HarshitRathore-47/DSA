1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i = 0;
4        int j = nums.length - 1;
5        int k=0;
6
7        if (nums.length == 0)
8            return k;
9
10        while (i < j) {
11            if (nums[i] == val) {
12                if (nums[i] == nums[j]) {
13                    j--;
14                } else {
15                    Swap(i,j,nums);
16                    i++;
17                    j--;
18                }
19            }
20            else {
21                i++;
22            }
23
24        }
25        for(int p:nums){
26            if (p!=val) k++;
27        }
28        return k;
29    }
30    public static void Swap(int i,int j,int[] nums){
31        int temp=nums[i];
32        nums[i]=nums[j];
33        nums[j]=temp;
34    }
35}