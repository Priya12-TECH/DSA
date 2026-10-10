class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       
       for(int j = 0; j<nums.length; j++){
        if(j > k){
            set.remove(nums[j - k -1]);
        }
        if(set.contains(nums[j])){
            return true;
        }
        set.add(nums[j]);
     }
     return false;
  }
}