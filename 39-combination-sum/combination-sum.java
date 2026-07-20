class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       combSum(candidates, 0, target, new ArrayList<>());
        return ans;
    }
    
    public void combSum(int[] arr , int i ,int target, ArrayList<Integer>combin){
        if(i == arr.length || target < 0){
            return ;
        }
        if(target == 0){
            ans.add(new ArrayList<>(combin));
            return;
        }

        combin.add(arr[i]);
        combSum(arr,i,target-arr[i],combin);

        combin.remove(combin.size()-1);
        combSum(arr,i+1,target,combin);
    }
}