class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> s_toindex = new HashMap<>();
        Map<Character, Integer> t_toindex = new HashMap<>();
        
        for(Integer i = 0; i< s.length(); ++i)
            if(s_toindex.put(s.charAt(i),i) != t_toindex.put(t.charAt(i),i))
                return false;

        return true;
    }
}