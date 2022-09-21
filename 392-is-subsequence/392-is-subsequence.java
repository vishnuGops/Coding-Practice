class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        int i = 0;
        while(i < t.length() && k < s.length()){
            if(s.charAt(k) == t.charAt(i)){
                ++i;
                ++k;
            }
            else
                ++i;
        }
        if(k == s.length())
            return true;
        else return false;
        
    }
}