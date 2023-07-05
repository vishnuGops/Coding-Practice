class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //get the values of x and y for the first 2 points to calculate the slope
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        //iterate through the other points to see if the slope is the same
        for( int i =2; i< coordinates.length; i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            //use slope formula
            if((y1-y0) * (x- x0) != (y-y0) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}