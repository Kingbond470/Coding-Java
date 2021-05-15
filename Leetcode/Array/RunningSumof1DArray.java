/*
https://leetcode.com/problems/running-sum-of-1d-array/
*/
import java.util.Scanner;
class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            runningSum[i]=sum;
        }
        
        return runningSum;
    }
}
