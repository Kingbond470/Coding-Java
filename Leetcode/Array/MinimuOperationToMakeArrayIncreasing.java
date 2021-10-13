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


//another
class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==0) return 0;
        
        int count=0;
        int num=nums[0];
        for(int i=1; i<nums.length; i++){
            if(num==nums[i]){
                num++;
                count++;
            }
            else if(num>nums[i]){
                num++;
                count=count+num-nums[i];
            }
            else{
                num=nums[i];
            }
        }
        return count;
    }
}

//easy logic

//     Start from index 1
//     if the current element (nums[i]) is less than the previous element(nums[i-1]) then have the difference count to store the difference, also +1 to make it increasing
//     Add the difference to the result count += diff
//     Add the difference to the current element nums[i] += diff
//     proceed till the end (nums.length)
//     return count

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1;i<nums.length;i++){
            if (nums[i] <= nums[i-1]) {
                int diff = nums[i-1] - nums[i] + 1;
                count += diff;
                nums[i] += diff;
            }
        }
        return count;
    }
}
