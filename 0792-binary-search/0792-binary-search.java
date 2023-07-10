class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int len = nums.length;
        int last = len -1;

        while(first <= last){
            int mid = last - first / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if( target < nums[mid]){
                last = mid -1;
            }
            else{
                first = mid +1;
            }
        }
        return -1;
    }
}