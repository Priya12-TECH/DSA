class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
       List <Boolean> ans = new ArrayList<>();

       for (int i=0; i<queries.length; i++){
         String query = queries[i];

         int q = 0;
         int p = 0;

         while ( q < query.length()){
            if(p<pattern.length() && query.charAt(q) == pattern.charAt(p)){
                q++;
                p++;
            } else if(Character.isLowerCase(query.charAt(q))){
                q++;
            } else {
                break;
            }
         }
         if(q == query.length() && p == pattern.length()){
            ans.add(true);
         } else {
            ans.add(false);
         }
       }
       return ans;
    }
}