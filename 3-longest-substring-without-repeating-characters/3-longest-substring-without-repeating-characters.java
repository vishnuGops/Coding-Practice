class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int left =0, right =0;
        int max =0;
        while(right < s.length()){
            if(!ans.contains(s.charAt(right))){
                ans.add(s.charAt(right));
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