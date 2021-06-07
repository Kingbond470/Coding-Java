/*
https://leetcode.com/problems/xor-operation-in-an-array/

[XOR Operation](https://www.codechef.com/problems/XORSN)

/*xor operation between a and b can be find using two ways

first way ------->
xor_value= ( a | b ) - ( a & b ) which is difference between bitwise or and and operation

second way --->
xor_value= a^b
*/
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=start+2*i;
        }
        int new_value=0;
        for(int i=0; i<n; i++){
           new_value=new_value^nums[i];
        }
        return new_value;
    }
}

//Another Approach
class Solution {
    public int xorOperation(int n, int start) {
        int xor_result=0;
        for(int i=0; i<n; i++){
            xor_result=xor_result^(start+2*i);
        }
        return xor_result;
    }
}
