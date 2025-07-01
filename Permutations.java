class Solution {
    ArrayList<List<Integer>> result = new ArrayList<>();;

    public List<List<Integer>> permute(int[] nums) {
        Allpermutations(nums,0);
        return result;
    }

    public void Allpermutations(int[] nums,int j) {
        if (j == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) current.add(num);
            result.add(current);
            return;
        }

        for (int i = j; i < nums.length; i++) {
            swap(nums, j, i);                  
            Allpermutations(nums, j + 1);             
            swap(nums, j, i);                    
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i]; 
        nums[i] = nums[j]; 
        nums[j] = temp;
    }
}