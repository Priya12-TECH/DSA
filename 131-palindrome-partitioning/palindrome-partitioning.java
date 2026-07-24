class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s , 0 , new ArrayList<>());
        return ans;
    }
    public void backtrack(String s , int idx , ArrayList<String>current){
        if(idx == s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }
        
        for(int i = idx; i<s.length(); i++){
            if(isPalindrome(s,idx,i)){
                current.add(s.substring(idx, i + 1));
                backtrack(s,i+1,current);
                current.remove(current.size()-1);
            }
        }
    }
    boolean isPalindrome(String s , int l , int r){
                while (l < r){
                    if(s.charAt(l) != s.charAt(r)){
                        return false;
                    }
                 l++;
                 r--;
                }
                return true;   
        }
}