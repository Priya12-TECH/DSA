class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> currentSubset = new ArrayList<>();
        subSeq(0, currentSubset, nums);
        return ans;
    }

    public void subSeq(int index, ArrayList<Integer> currentSubset, int[] nums) {

        // Base Case
        if (index == nums.length) {
            ans.add(new ArrayList<>(currentSubset)); // Store a copy
            return;
        }

        // Take the current element
        currentSubset.add(nums[index]);
        subSeq(index + 1, currentSubset, nums);

        // Backtrack (Undo)
        currentSubset.remove(currentSubset.size() - 1);

        // Don't take the current element
        subSeq(index + 1, currentSubset, nums);
    }
}