/*
https://leetcode.com/problems/minimum-time-visiting-all-points/
*/
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int second=0;
        for(int i=0; i<points.length-1; i++){
            
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[i+1][0];
                int y2=points[i+1][1];
                
                int value1=Math.abs(x1-x2);
                int value2=Math.abs(y1-y2);
                second=second+Math.max(value1,value2);
            
        }
        return second;
    }
}
