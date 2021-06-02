/*
https://leetcode.com/problems/number-of-good-pairs/
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}

/*
Another approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            count += map.get(n) - 1;  
        }
        return count;
    }
}
*/
