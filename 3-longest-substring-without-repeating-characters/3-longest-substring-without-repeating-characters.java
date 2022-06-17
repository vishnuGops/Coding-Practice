// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         Map<Character, Integer> ans = new HashMap<>();
//         int left =0; 
//         int right =0;
//         int max = 0;
//         while(right < s.length()){
//             if(ans.containsKey(s.charAt(right))){
//                 ans.remove(s.charAt(left));
//                 left++;
//             }
//             ans.put(s.charAt(right),right);
//             right++;
//             max = Math.max(max, ans.size());
//         }
//         return max;
//     }
// }

class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        // O(n) time | O(n) space
        HashSet<Character> mySet = new HashSet<>();
        
        int left = 0, right = 0;
        int max = 0;
        
        while(right < s.length())
        {            
            if(!mySet.contains(s.charAt(right)))
            {
                mySet.add(s.charAt(right));
                right++;
                max = Math.max(max, mySet.size());
            }
            else
            {
                mySet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}