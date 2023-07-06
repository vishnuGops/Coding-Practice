class Solution {
    public int largestAltitude(int[] gain) {
        int top = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0; i< gain.length; i++){
            top = Math.max(sum , top);
            sum = sum + gain[i];
        }
        return Math.max(top, sum);
        
    }
}