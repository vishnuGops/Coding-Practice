class Solution {
    public int maxSubArray(int[] nums) {
        int[] max = new int[nums.length];
        
        for(int i = 0; i< nums.length; i++){
            if(i > 0 && max[i-1] >0)
                max[i] = max[i-1] + nums[i];
            else
                max[i] = nums[i];
            
        }
        return Arrays.stream(max).max().getAsInt();
    }
}