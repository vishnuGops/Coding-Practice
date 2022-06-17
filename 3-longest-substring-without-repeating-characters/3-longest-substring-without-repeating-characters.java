class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        int left =0; 
        int right =0;
        int max = 0;
        while(right < s.length()){
            if(!ans.containsKey(s.charAt(right))){
                ans.put(s.charAt(right),right);
                right++;
                max = Math.max(max, ans.size());
                
            }
            else{
                ans.remove(s.charAt(left));
                left++;
            }
            
        }
        return max;
    }
}

