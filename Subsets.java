class Solution {
    static ArrayList<List<Integer>> result =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.clear();
        ArrayList<Integer> Subset=new ArrayList<>();
        int n = nums.length;
        AllSubsets(nums,0,Subset, n);
        return result;
    }
    public static void AllSubsets(int[] nums, int idx,ArrayList<Integer> Subset,int n){
        if(idx==n){
            result.add(new ArrayList<>(Subset));
            return;
        }
        //backtracking
            Subset.add(nums[idx]);
            AllSubsets(nums,idx+1,Subset,n);
            Subset.remove(Subset.size()-1);
            AllSubsets(nums,idx+1,Subset,n);
    }
}