class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> stack = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        bt(nums, 0);
        return result;
    }

    private void bt(int[] nums, int i) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(stack));
            return;
        }

        stack.add(nums[i]);
        bt(nums, i + 1);

        stack.remove(stack.size() - 1);
        bt(nums, i + 1);
    }
}
