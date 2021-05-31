/*
https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}

//optimized apporach from submission
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
*/
