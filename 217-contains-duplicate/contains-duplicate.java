class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int j = 0; j<nums.length; j++){
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
        }
       return false; 
    }
}