class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurence(nums,target,n);
        int last = lastOccurence(nums,target,n);

        return new int[]{first, last};
    }
    public int firstOccurence(int[] nums,int target,int n){
        int first = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                first = mid;
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid -1;
            }
        }
        return first;
    }
    public int lastOccurence(int[]nums , int target,int n){
        int last = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                last = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return last;
    }
}