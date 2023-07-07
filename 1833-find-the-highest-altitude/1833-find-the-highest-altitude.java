class Solution {
    public int largestAltitude(int[] gain) {
        int top = 0;
        int sum = 0;
        for(int i =0; i< gain.length; i++){
            sum  += gain[i];
            if(top < sum){
                top = sum;
            }
        }
        return top;
        
    }
}