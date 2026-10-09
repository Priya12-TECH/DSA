class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int [26];
        int[] freq2 = new int [26];
        for(int i = 0; i < s.length(); i++){
           freq1[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            freq2[t.charAt(j) - 'a']++;
        }
        for(int x = 0; x<26; x++){
            if(freq1[x] != freq2[x]){
                return false;
            }
        }
        return true;
    }
}