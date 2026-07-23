class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        nonDecreas(nums,0,new ArrayList<>());
        return ans;
    }
    public void nonDecreas(int[] nums , int idx , ArrayList<Integer>current){
        if(current.size() >= 2){
            ans.add(new ArrayList<>(current));
            
        }
         boolean[] used = new boolean[201];

        for(int i = idx; i<nums.length; i++){
            int index = nums[i] + 100;

            if (used[index]) {
                continue;
            }

            used[index] = true;

            if(current.size() == 0 || nums[i] >= current.get(current.size() - 1)){
                current.add(nums[i]);
                nonDecreas(nums, i + 1 , current);
                current.remove(current.size() -1 );
            }
        }
    }
}