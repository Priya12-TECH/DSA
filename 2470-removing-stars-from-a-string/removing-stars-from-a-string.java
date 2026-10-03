class Solution {
    public String removeStars(String s) {
        Stack <Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
    
            if(s.charAt(i) == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
    }
    StringBuilder ans = new StringBuilder();
    for(int i = 0; i<stack.size(); i++){
        ans.append(stack.get(i));
    }
    return ans.toString();
}
}