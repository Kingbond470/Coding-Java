// https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
     //primary diagonal is i==j
    // secondary diagonla is i+j
        int sum=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++) {
                if(i==j && i+j!=mat.length-1) sum=sum+mat[i][j];
                else if(i+j==mat.length-1) sum=sum+mat[i][j];
                
                
            }        // as it is square matrix
                
            
        }
        return sum;
    }
}


//another method
class Solution {
    public int diagonalSum(int[][] mat) {
     //primary diagonal is i==j
    // secondary diagonla is i+j
        int sum=0;
       for(int i=0; i<mat.length; i++){
           sum+=mat[i][i];
           sum+=mat[mat.length-i-1][i];
       }
       if (mat.length%2==1) sum=sum-mat[mat.length/2][mat.length/2] ;
        return sum;
    }
}
