class Solution {
    public int smallestEvenMultiple(int n) {
        int i = 1;
        while((n*i)%2 != 0){
            i++;
        }
        return n*i;
    }
}