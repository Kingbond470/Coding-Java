/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count_arr=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j] && j!=i){
                    count++;
                }
            }
            count_arr[i]=count;
        }
        return count_arr;
    }
}

/*

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] copy_of_array = nums.clone();     //copy the array
        
        Arrays.sort(copy_of_array); //sort the array
        
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy_of_array[i], i);
            //count the index as 1st position number will be greater than o elements and 2 st position will be greater than 1 and so on...
        }
        
        for (int i = 0; i < nums.length; i++) {
            copy_of_array[i] = map.get(nums[i]);
        }
        
        return copy_of_array;
    }
}
*/
