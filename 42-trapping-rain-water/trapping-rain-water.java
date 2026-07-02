class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = n-1;
        while(l < r){
             lmax = Math.max(lmax , height[l]);
             rmax = Math.max(rmax , height[r]);

             if(lmax < rmax){
                ans = ans + lmax - height[l];
                l++;
             } else {
                ans = ans + rmax - height[r];
                r--;
             }
        }
        return ans;
    }
}