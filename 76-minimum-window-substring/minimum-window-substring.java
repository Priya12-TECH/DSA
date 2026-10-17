class Solution {
    public String minWindow(String s, String t) {
         int m = s.length();
         int n = t.length();
    
         if(n > m){
            return "";
         }
         HashMap <Character,Integer> map = new HashMap<>();
         for(int x = 0; x < n; x++){
            char ch = t.charAt(x);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int requiredCount = t.length();
         int i = 0; 
         int j = 0;
         int start_i = 0;
         int windowSize = Integer.MAX_VALUE;

         while(j < m){
            char ch = s.charAt(j);
            if(map.getOrDefault(ch, 0) > 0){
                requiredCount--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
         
         while(requiredCount == 0){
            int currentWindowSize = j - i + 1;
         
         if(currentWindowSize < windowSize){
            windowSize = currentWindowSize;
             start_i = i;
         }
         char left = s.charAt(i);
         map.put(left, map.getOrDefault(left, 0) + 1);
         if(map.get(left) > 0){
            requiredCount++;
         }
        i++;
    }
    j++;
  }
  if(windowSize == Integer.MAX_VALUE){
    return "";
  }
  return s.substring(start_i,start_i + windowSize);
    }
}