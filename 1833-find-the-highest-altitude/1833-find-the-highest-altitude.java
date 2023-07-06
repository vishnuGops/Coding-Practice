class Solution {
    public int largestAltitude(int[] gain) {
        int top = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0; i< gain.length; i++){
            if(sum > top){
                top = sum;
            }
            sum = sum + gain[i];
        }
        if(sum > top){
        top = sum;
        }
        return top;
    }
}