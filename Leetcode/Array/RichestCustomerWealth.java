/*
https://leetcode.com/problems/richest-customer-wealth/
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        //int add=0;
        int max_add=0;
      for(int i=0; i<accounts.length; i++){
          int add=0;
          for(int j=0; j<accounts[i].length; j++){
              add=add+accounts[i][j];
          }
          if(add>max_add){
    max_add=add;
          }
      }  
        return max_add;
    }
}
