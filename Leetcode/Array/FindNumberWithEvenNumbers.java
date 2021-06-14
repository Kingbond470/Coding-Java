/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
*/
class Solution {
    public int findNumbers(int[] nums) {
        int even_count=0;
        for(int i=0; i<nums.length; i++){
            int number=nums[i];
            int count=0;
            while(number>0){
                count=count+1;
                number=number/10;
               // System.out.print(count+" ");
                }
            if(count%2==0){
                even_count++;
            }
        }
        
        return even_count;
    }
    
}

//Another Approach
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int value=nums[i];
            if(value>=10 && value<100 || value>=1000 && value<10000 || value>=100000 && value<1000000){
                count++;
            }
        }
        
        return count;
    }
    
}
