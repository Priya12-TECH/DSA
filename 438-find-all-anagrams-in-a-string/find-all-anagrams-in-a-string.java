class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = p.length();
        int[] freq = new int[26];

        for(int x = 0; x<k; x++){
            freq[p.charAt(x) - 'a']++;
        }
        while(j < s.length()){
            freq[s.charAt(j) -'a']--;

            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                boolean match = true;

            for(int x = 0; x<26; x++){
                if(freq[x] != 0){
                    match = false;
                    break;
                }
            }
            if(match){
            list.add(i);
        }
        freq[s.charAt(i) -'a']++;
        i++;
        j++;
        }
        
    }

     return list;      
        
    }
}