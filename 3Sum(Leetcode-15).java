//change the class name before executing
//Two Sum approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = 0 - nums[i];
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(target - nums[j])) {
                    List<Integer> innerlist = new ArrayList<>();

                    innerlist.add(nums[i]);
                    innerlist.add(nums[j]);
                    innerlist.add(target - nums[j]);
                    result.add(innerlist);
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }

                }
                set.add(nums[j]);
            }

        }
        return result;
    }
}

//Two Pointers
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;//for duplicates
            int start = i + 1, end = nums.length - 1;
            
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) start++;//for duplicates
                    while (start < end && nums[end] == nums[end - 1]) end--;//for duplicates
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        
        return result;
    }
}
