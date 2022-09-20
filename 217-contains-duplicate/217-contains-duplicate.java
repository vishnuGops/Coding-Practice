class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> check = new HashMap<>();
        
        for(int i =0; i < nums.length; i++){
            if(check.containsKey(nums[i]))
                return true;
            check.put(nums[i], i);
        }
        return false;
        
    }
}