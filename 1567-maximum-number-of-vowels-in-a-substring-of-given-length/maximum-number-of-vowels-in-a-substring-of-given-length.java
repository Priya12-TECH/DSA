class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0;
        int max_vowels = 0;
        int count = 0;
        int j = k;

        for(int x = 0; x<k; x++){
            if(s.charAt(x) == 'a' || s.charAt(x) == 'i' 
            || s.charAt(x) == 'e' ||s.charAt(x) == 'o' || s.charAt(x) == 'u')
            count++;
        }
          max_vowels = Math.max(max_vowels,count);
         while(j < n){
           char left = s.charAt(i);
           if(left == 'a' || left == 'i' || left == 'e' || left == 'o' || left == 'u'){
            count--;
           }
           char right = s.charAt(j);
           if(right == 'a' || right == 'i' || right == 'e' || right == 'o' || right == 'u'){
            count ++;
           }
         
        max_vowels = Math.max(max_vowels,count);
        i++;
        j++;
    }
        return max_vowels;

    }
}