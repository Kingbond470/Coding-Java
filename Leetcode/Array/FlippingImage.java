/*
https://leetcode.com/problems/flipping-an-image/
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int[][] new_arr=new int[arr.length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length-1,k=0; j>=0; j--,k++){
               new_arr[i][k]=arr[i][j];
               // System.out.print(new_arr[i][k]+" ");
            }
          //  System.out.println();
        }
         for(int i=0; i<new_arr.length; i++){
            for(int j=0; j<new_arr[i].length; j++){
            if(new_arr[i][j]==0){
                    new_arr[i][j]=1;
                }
                else{
                    new_arr[i][j]=0;
                }
            }
        }
       
        return new_arr;
    }
}


//Another Approach
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int[][] new_arr=new int[arr.length][arr.length];
        for(int i=0; i<arr.length; i++){
            int[] index_row=new int[arr.length];
            for(int j=arr.length-1,k=0; j>=0; j--){
                if(arr[i][j]==0){
                    index_row[k]=1;
                }
                k++;
            }
            new_arr[i]=index_row;
        }
        return new_arr;
    }
}
