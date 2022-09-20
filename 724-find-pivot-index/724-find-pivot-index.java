class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int lefttotal = 0;
        for(int num : nums)
            total += num;
        
        for(int i =0; i < nums.length; i++){
            total = total - nums[i];
            if(total == lefttotal)
                return i;
            lefttotal += nums[i];
        }
        return -1;
    }
}