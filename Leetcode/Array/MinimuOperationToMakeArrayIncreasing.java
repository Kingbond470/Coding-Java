//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
class Solution {
    public int minOperations(int[] nums) {
        int count=0;
      for(int i=1; i<nums.length; i++){
          if(nums[i-1]>=nums[i]){
              count=count+nums[i-1]-nums[i]+1;    //finding the difference and adding it to count as well as current array value 
             
              nums[i]=nums[i-1]+1;
          }
      }
        return count;
    }
}
