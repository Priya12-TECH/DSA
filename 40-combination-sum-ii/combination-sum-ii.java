class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combSum2(candidates,0,target,new ArrayList<>());
        return ans;
    }
    public void combSum2(int[] candidates , int idx, int target , ArrayList<Integer>combin){
        if(target == 0){
            ans.add(new ArrayList<>(combin));
            return;
        }
        if(target < 0){
            return;
        }

        for(int i = idx; i < candidates.length; i++){
            if( i > idx && candidates[i] == candidates[i-1]){
                continue;
            }
            combin.add(candidates[i]);
            combSum2(candidates,i+1,target-candidates[i],combin); // Do
            combin.remove(combin.size()-1); //BackTrack
            
        }
    }
}