/*
https://leetcode.com/problems/move-zeroes/
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                index++;
            }
            else if(index>0){
                int value=nums[i];
                nums[i]=0;
                nums[i-index]=value;
            }
        }
       
    }
}
