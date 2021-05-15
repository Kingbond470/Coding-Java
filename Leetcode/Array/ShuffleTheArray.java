/*
https://leetcode.com/problems/shuffle-the-array/
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
      int length=nums.length;
        int[] new_nums=new int[length];
        for(int i=0; i<n; i++){
            new_nums[2*i] = nums[i];
            new_nums[2*i+1]=nums[n+i];
            
        }
        return new_nums;
    }
}
