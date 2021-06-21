
// Brute Force Approach

// find the max element in array
// find second max element in array (simply find the max element except previous max)
// similarly third max and add it to array list and if size is 0 then return max otherwise third max
class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
         int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        if(nums.length<=2){
            third_max=nums[nums.length-1];
        }
        else{
         max=nums[nums.length-1];
         for(int i=0; i<nums.length; i++){
            if(nums[i]!=max){
                second_max=Math.max(second_max,nums[i]);
            }
         }
        
            //finding last max
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=max && nums[i]!=second_max){
                    list.add(nums[i]);
                }
            }
            if(list.size()==0) list.add(max);
            for(int value:list){
              //  System.out.println(list);
                third_max=Math.max(third_max,value);
            }
        }
        
       return third_max; 
    }
}



// Using one Loop
// defining the Integer class to null
// checking if the value is equal to first, second and third max then continue
// if the value is greater than max or equal to null then max=n, max2=max, max3=max2
// similary for max2 and max3
// in the end check if max3 is null then return max otherwise max
class Solution {
    public int thirdMax(int[] nums) {
      Integer max=null;
        Integer second_max=null;
        Integer third_max=null;
        
        for(Integer n: nums){
            if(n.equals(max) || n.equals(second_max) || n.equals(third_max)) continue;
            
            if(max==null || n>max){
                third_max=second_max;
                second_max=max;
                max=n;
            }
            else if(second_max==null || n>second_max){
                third_max=second_max;
                second_max=n;
            }
            else if(third_max==null || n>third_max){
                third_max=n;
            }
        }
        return third_max==null ? max: third_max;
    }
}

// Using HashSet
//add all your numbers to the set.
//check if the set size is less than 3 (there won't be a 3rd largest max then).
//if size >= 3 then remove the max 2 times so the next call 
//to find the max returns the 3rd largest max
class Solution {
    public int thirdMax(int[] nums) {
     HashSet<Integer> set=new HashSet<>();
        for(int i: nums) set.add(i);
        if(set.size()<3) return Collections.max(set);
        else {
            for(int i=0; i<2; i++) set.remove(Collections.max(set));
            return Collections.max(set);
        }
        
        
    }
}



