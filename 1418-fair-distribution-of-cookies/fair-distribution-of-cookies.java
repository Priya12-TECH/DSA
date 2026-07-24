class Solution {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        int [] children = new int [k];
        solve(cookies,0,k,children);
        return ans;
    }
    public void solve(int[] cookies ,int idx, int k ,int [] children){
        if(idx >= cookies.length){
            int unfairness = 0;
            for(int i = 0; i<children.length; i++){
                unfairness = Math.max(unfairness , children[i]);
            }
            ans = Math.min(ans , unfairness);
            return;
        }
        int cookie = cookies[idx];

        for(int i = 0; i<k; i++){
            children[i] = children[i] + cookie;

            solve(cookies, idx+1 ,k,children);

            children[i] = children[i] - cookie;
        }
    }
}