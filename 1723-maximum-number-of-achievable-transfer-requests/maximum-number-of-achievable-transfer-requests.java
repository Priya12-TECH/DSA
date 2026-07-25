class Solution {
    int result = 0;
    public int maximumRequests(int n, int[][] requests) {
        int [] resultant = new int [n];
        solve(0,0,n,requests,resultant);
        return result;
    }

    public void solve (int index , int count , int n , int[][]requests, int []resultant){
        if(index == requests.length){
            for(int i=0; i<n; i++){
                if(resultant[i] != 0){
                    return;
                }
            }
            result = Math.max(result,count);
            return;
        }
        int from = requests[index][0];
        int to = requests[index][1];

        resultant[from]--;
        resultant[to]++;

        solve(index + 1 , count + 1, n , requests , resultant);

        resultant[from]++;
        resultant[to]--;

        solve(index + 1 , count , n , requests,resultant);
    }
}